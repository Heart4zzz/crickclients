package fun.crickclient.api.utils.animation;

/**
 * Анимация с фиксированной длительностью: значение плавно едет к цели за {@code duration} миллисекунд
 * по заданной кривой {@link Easing}.
 * <p>
 * В отличие от {@link AnimationUtils} (скоростная модель), тут длительность перехода задаётся явно,
 * что удобно для HUD-элементов, где важна одинаковая скорость появления/исчезновения строк.
 */
public class TimedAnimation {

    private final Easing easing;
    private final long duration;

    private double value;
    private double from;
    private double target;
    private long startTime;

    public TimedAnimation(Easing easing, long durationMs) {
        this(easing, durationMs, 0.0);
    }

    public TimedAnimation(Easing easing, long durationMs, double initialValue) {
        this.easing = easing == null ? Easings.LINEAR : easing;
        this.duration = Math.max(1L, durationMs);
        this.value = initialValue;
        this.from = initialValue;
        this.target = initialValue;
        this.startTime = System.currentTimeMillis() - this.duration;
    }

    /**
     * Двигает анимацию к цели. Вызывается каждый кадр.
     */
    public double run(double newTarget) {
        if (this.target != newTarget) {
            this.from = this.value;
            this.target = newTarget;
            this.startTime = System.currentTimeMillis();
        }

        long elapsed = System.currentTimeMillis() - this.startTime;
        if (elapsed >= this.duration) {
            this.value = this.target;
            return this.value;
        }

        double part = Math.max(0.0, Math.min(1.0, elapsed / (double) this.duration));
        this.value = this.from + (this.target - this.from) * this.easing.ease(part);
        return this.value;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
        this.from = value;
        this.target = value;
        this.startTime = System.currentTimeMillis() - this.duration;
    }

    public double getTarget() {
        return this.target;
    }

    public boolean isDone() {
        return System.currentTimeMillis() - this.startTime >= this.duration;
    }
}
