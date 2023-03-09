package company.a.b.c.streams.cars;

public class Options {

    private boolean airconditioning;

    private boolean radio;

    public boolean isAirconditioning() {
        return airconditioning;
    }

    public boolean isRadio() {
        return radio;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    private String operatingSystem;

    public Options(final boolean airconditioning, final boolean radio, final String operatingSystem) {
        this.airconditioning = airconditioning;
        this.radio = radio;
        this.operatingSystem = operatingSystem;
    }
}
