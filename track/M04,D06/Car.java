
class Car {

    static void convertKmintoMiles() {
        System.out.println("Converting KM Into Miles...");
    }

    void calculateMilage() {
        System.out.println("Calculating Milage...");
    }
}

class Main {

    public static void main(String[] args) {
        Car.convertKmintoMiles();
        Car nano = new Car();
        nano.calculateMilage();

    }
}
