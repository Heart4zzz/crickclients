#version 150

uniform sampler2D Sampler0;
uniform sampler2D Sampler1;
uniform vec2 texelSize;
uniform vec3 color;
uniform vec3 color2;
uniform float time;

in vec2 TexCoord;
out vec4 OutColor;

float hash21(vec2 p) {
    p = fract(p * vec2(127.1, 311.7));
    p += dot(p, p + 34.5);
    return fract(p.x * p.y);
}

float noise(vec2 p) {
    vec2 i = floor(p);
    vec2 f = fract(p);
    f = f * f * (3.0 - 2.0 * f);
    return mix(mix(hash21(i), hash21(i + vec2(1.0, 0.0)), f.x),
               mix(hash21(i + vec2(0.0, 1.0)), hash21(i + vec2(1.0, 1.0)), f.x), f.y);
}

void main() {
    vec2 uv = TexCoord;
    float mask = texture(Sampler1, uv).a;
    float density = texture(Sampler0, uv).r * (1.0 - mask);

    float aspect = texelSize.y / max(texelSize.x, 0.000001);
    vec2 p = vec2(uv.x * aspect, uv.y);
    float shimmer = noise(p * 13.0 + vec2(time * 0.32, -time * 0.21));
    float broad = noise(p * 5.0 + vec2(-time * 0.12, time * 0.18));

    float wisps = smoothstep(0.018, 0.62, density);
    wisps *= mix(0.70, 1.10, shimmer);
    float core = smoothstep(0.18, 0.82, density);
    float gradient = clamp(uv.y * 0.58 + broad * 0.55, 0.0, 1.0);
    vec3 smokeColor = mix(color, color2, gradient);
    smokeColor = mix(smokeColor * 0.68, smokeColor * 1.18 + vec3(0.05), core);

    float alpha = clamp(wisps * 0.72, 0.0, 0.88);
    if (alpha <= 0.002) discard;
    OutColor = vec4(smokeColor, alpha);
}
