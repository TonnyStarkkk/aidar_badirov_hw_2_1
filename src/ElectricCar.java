final class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String manufacturer, Engine engine, int numberOfSeats, int batteryCapacity) {
        super(manufacturer, engine, numberOfSeats, FuelType.ELECTRIC);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    //Перезаписываем метод родителя
    @Override
    public void drive() {
        System.out.println("The electric car is driving silently.");
    }
}
