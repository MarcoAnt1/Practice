package exercism.easy.help;

public enum Planet {
    MERCURY(0.2408467),
    VENUS(0.61519726),
    EARTH(1.0),
    MARS(1.8808158),
    JUPITER(11.862615),
    SATURN(29.447498),
    URANUS(84.016846),
    NEPTUNE(164.79132);

    private final double orbitalPeriodInEarthYears;
    private static final double EARTH_YEAR_IN_SECONDS = 31_557_600;

    Planet(double orbitalPeriodInEarthYears) {
        this.orbitalPeriodInEarthYears = orbitalPeriodInEarthYears;
    }

    public double secondPerYear() {
        return orbitalPeriodInEarthYears * EARTH_YEAR_IN_SECONDS;
    }
}
