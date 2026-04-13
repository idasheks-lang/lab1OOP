public class Bus extends Vehicle {

    private int passengerCapacity;

    public Bus(String make, String model, int year, String color) {
        super(make, model, year, color);
        this.passengerCapacity = 50;
    }

    @Override
    public void accelerate(double amount) {
        setCurrentSpeed(getCurrentSpeed() + amount);
        System.out.println("Bus speed: " + getCurrentSpeed() + " km/h");
    }

    @Override
    public void stop() {
        setCurrentSpeed(0);
        System.out.println("Bus stopped. Passengers may board/exit.");
    }

    @Override
    public void gas(double liters) {
        System.out.println("Bus refueled with " + liters + "L of diesel.");
    }

    public int getPassengerCapacity() { return passengerCapacity; }
}