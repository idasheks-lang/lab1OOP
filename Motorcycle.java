public class Motorcycle extends Vehicle {

    public Motorcycle(String make, String model, int year, String color) {
        super(make, model, year, color);
    }

    @Override
    public void accelerate(double amount) {
        setCurrentSpeed(getCurrentSpeed() + amount);
        System.out.println("Motorcycle speed: " + getCurrentSpeed() + " km/h");
    }

    @Override
    public void stop() {
        setCurrentSpeed(0);
        System.out.println("Motorcycle stopped.");
    }

    @Override
    public void gas(double liters) {
        System.out.println("Motorcycle refueled with " + liters + "L");
    }
}