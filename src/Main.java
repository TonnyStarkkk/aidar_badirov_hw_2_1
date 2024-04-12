public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(200);
        Car objectA = new Car("Toyota", engine, 4, FuelType.GASOLINE);
        ElectricCar objectB = new ElectricCar("Tesla", engine, 5, 100);
        ElectricCar objectC = new ElectricCar("Nissan", engine, 4, 80);

        System.out.println("Car A:");
        System.out.println("Manufacturer: " + objectA.getManufacturer());
        System.out.println("Engine horsepower: " + objectA.getEngine().getHorsepower());
        System.out.println("Number of Seats: " + objectA.getNumberOfSeats());
        System.out.println("Fuel Type: " + objectA.getFuelType());

        //Вызов перегруженного метода через objectA
        objectA.drive();
        // Вызов неперезаписываемого метода через objectA
        objectA.park();

        //Печать свойств обьекта object2
        System.out.println("\nElectric Car B:");
        System.out.println("Manufacturer: " + objectB.getManufacturer());
        System.out.println("Engine horsepower: " + objectB.getEngine().getHorsepower());
        System.out.println("Number of Seats: " + objectB.getNumberOfSeats());
        System.out.println("Battery Capacity: " + objectB.getBatteryCapacity());

        objectB.drive();

        //Печать свойств объекта objectC
        System.out.println("\nElectric Car C:");
        System.out.println("Manufacturer: " + objectC.getManufacturer());
        System.out.println("Engine horsepower: " + objectC.getEngine().getHorsepower());
        System.out.println("Number of Seats: " + objectC.getNumberOfSeats());
        System.out.println("Battery Capacity: " + objectC.getBatteryCapacity());

        objectC.drive();
    }
}