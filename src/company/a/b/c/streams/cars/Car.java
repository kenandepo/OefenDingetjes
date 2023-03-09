package company.a.b.c.streams.cars;

public class Car {

    private int doors;

    private int numberOfSeats;

    private int topSpeed;

    private  String model;

    private Options options;

    public Car(final int doors, final int numberOfSeats, final int topSpeed, final String model, final Options options) {
        this.doors = doors;
        this.numberOfSeats = numberOfSeats;
        this.topSpeed = topSpeed;
        this.model = model;
        this.options=options;
    }

    public int getDoors() {
        return doors;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getModel() {
        return model;
    }

    public Options getOptions() {
        return options;
    }

    public int getTopSpeed( ){
        return this.topSpeed;
    }
}
