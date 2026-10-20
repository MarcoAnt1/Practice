package exercism.easy;

public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int elapsedMinutes) {
        return expectedMinutesInOven() - elapsedMinutes;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int elapsedMinutes) {
        int layersInMinutes = preparationTimeInMinutes(layers);
        return layersInMinutes + elapsedMinutes;
    }
}
