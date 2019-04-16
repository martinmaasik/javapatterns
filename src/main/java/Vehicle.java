public abstract class Vehicle {
    protected FuelType fuelType;

    public Vehicle(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    abstract public void tankUp();
}
