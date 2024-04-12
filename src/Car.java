class Car extends Vehicle{
    private int numberOfSeats;
    private FuelType fuelType;

    public Car(String manufacturer, Engine engine, int numberOfSeats, FuelType fuelType) {
        super(manufacturer, engine);
        this.numberOfSeats = numberOfSeats;
        this.fuelType = fuelType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
    //Перегруженный метод
    public void drive(){
        System.out.println("The car is driving.");
    }
    //Непераписываемый метод
    public final void park(){
        System.out.println("The car is parked.");
    }
}
