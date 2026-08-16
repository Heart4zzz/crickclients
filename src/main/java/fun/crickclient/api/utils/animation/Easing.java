package fun.crickclient.api.utils.animation;

@FunctionalInterface
public interface Easing {
    double ease(double value);
}