package exercism.easy;

import exercism.easy.help.Planet;

public class SpaceAge {
    private final double ageInSeconds;

    public SpaceAge(double seconds) {
        this.ageInSeconds = seconds;
    }

    public double getSeconds() {
        return ageInSeconds;
    }

    public double onEarth() {
        return ageOn(Planet.EARTH);
    }

    double onMercury() {
        return ageOn(Planet.MERCURY);
    }

    double onVenus() {
        return ageOn(Planet.VENUS);
    }

    double onMars() {
        return ageOn(Planet.MARS);
    }

    double onJupiter() {
        return ageOn(Planet.JUPITER);
    }

    double onSaturn() {
        return ageOn(Planet.SATURN);
    }

    double onUranus() {
        return ageOn(Planet.URANUS);
    }

    double onNeptune() {
        return ageOn(Planet.NEPTUNE);
    }

    private double ageOn(Planet planet) {
        return ageInSeconds / planet.secondPerYear();
    }
}
