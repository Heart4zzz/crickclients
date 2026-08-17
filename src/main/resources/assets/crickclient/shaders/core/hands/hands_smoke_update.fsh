#version 150

uniform sampler2D Sampler0;
uniform sampler2D Sampler1;
uniform vec2 texelSize;
uniform float time;
uniform float deltaTime;

in vec2 TexCoord;
out vec4 OutColor;

float hash21(vec2 p) {
    p = fract(p * vec2(123.34, 456.21));
    p += dot(p, p + 45.32);
    return fract(p.x * p.y);
}

float valueNoise(vec2 p) {
    vec2 i = floor(p);
    vec2 f = fract(p);
    f = f * f * (3.0 - 2.0 * f);
    return mix(mix(hash21(i), hash21(i + vec2(1.0, 0.0)), f.x),
               mix(hash21(i + vec2(0.0, 1.0)), hash21(i + vec2(1.0, 1.0)), f.x), f.y);
}

float fbm(vec2 p) {
    float result = 0.0;
    float amplitude = 0.55;
    for (int i = 0; i < 4; i++) {
        result += valueNoise(p) * amplitude;
        p = p * 2.03 + vec2(17.1, 9.2);
        amplitude *= 0.48;
    }
    return result;
}

float maskAt(vec2 uv) {
    return texture(Sampler0, clamp(uv, vec2(0.0), vec2(1.0))).a;
}

void main() {
    vec2 uv = TexCoord;
    float aspect = texelSize.y / max(texelSize.x, 0.000001);
    vec2 fieldUv = vec2(uv.x * aspect, uv.y);

    float slowNoise = fbm(fieldUv * 5.2 + vec2(time * 0.17, -time * 0.31));
    float detailNoise = fbm(fieldUv * 10.5 + vec2(-time * 0.38, time * 0.22));
    float turbulence = (slowNoise - 0.5) * 2.0;

    // Backtrace the previous frame. The positive vertical flow makes the smoke rise,
    // while the two noise fields stop a stationary silhouette from looking frozen.
    vec2 velocity = vec2(turbulence * 0.010 + (detailNoise - 0.5) * 0.004,
                         0.014 + slowNoise * 0.006);
    vec2 previousUv = clamp(uv - velocity * deltaTime, vec2(0.001), vec2(0.999));
    float history = texture(Sampler1, previousUv).r;

    vec2 diffusionStep = texelSize * 1.65;
    float spread = texture(Sampler1, previousUv + vec2(diffusionStep.x, 0.0)).r
                 + texture(Sampler1, previousUv - vec2(diffusionStep.x, 0.0)).r
                 + texture(Sampler1, previousUv + vec2(0.0, diffusionStep.y)).r
                 + texture(Sampler1, previousUv - vec2(0.0, diffusionStep.y)).r;
    history = mix(history, spread * 0.25, min(1.0, deltaTime * 5.0));

    float center = maskAt(uv);
    vec2 r1 = texelSize * 3.5;
    vec2 r2 = texelSize * 8.0;
    float dilated = center;
    dilated = max(dilated, maskAt(uv + vec2( r1.x, 0.0)));
    dilated = max(dilated, maskAt(uv + vec2(-r1.x, 0.0)));
    dilated = max(dilated, maskAt(uv + vec2(0.0,  r1.y)));
    dilated = max(dilated, maskAt(uv + vec2(0.0, -r1.y)));
    dilated = max(dilated, maskAt(uv + vec2( r1.x,  r1.y)));
    dilated = max(dilated, maskAt(uv + vec2(-r1.x,  r1.y)));
    dilated = max(dilated, maskAt(uv + vec2( r1.x, -r1.y)));
    dilated = max(dilated, maskAt(uv + vec2(-r1.x, -r1.y)));
    dilated = max(dilated, maskAt(uv + vec2( r2.x, 0.0)) * 0.78);
    dilated = max(dilated, maskAt(uv + vec2(-r2.x, 0.0)) * 0.78);
    dilated = max(dilated, maskAt(uv + vec2(0.0,  r2.y)) * 0.78);
    dilated = max(dilated, maskAt(uv + vec2(0.0, -r2.y)) * 0.78);

    float boundary = max(0.0, dilated - center) * (1.0 - center);
    float animatedBreakup = smoothstep(0.22, 0.82, slowNoise * 0.65 + detailNoise * 0.55);
    float emitter = boundary * mix(0.38, 1.0, animatedBreakup);

    float decay = exp(-deltaTime * mix(0.72, 1.12, detailNoise));
    float density = history * decay + emitter * deltaTime * 4.8;
    density *= 1.0 - center * 0.92;
    density = clamp(density, 0.0, 1.0);
    OutColor = vec4(density, density, density, density);
}
