class Vehicle {
    private String manufacturer;
    private Engine engine;

    public Vehicle(String manufacturer, Engine engine) {
        this.manufacturer = manufacturer;
        this.engine = engine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }
}
