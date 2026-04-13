public class SportsCar extends Vehicle implements Automobile {

    private double fuelLevel;
    private boolean engineRunning;

    public SportsCar(String make, String model, int year, String color) {
        super(make, model, year, color);
        this.fuelLevel = 60.0;
        this.engineRunning = false;
    }

    @Override
    public void accelerate(double amount) {
        setCurrentSpeed(getCurrentSpeed() + amount);
        System.out.println("SportsCar speed: " + getCurrentSpeed() + " km/h");
    }

    @Override
    public void stop() {
        setCurrentSpeed(0);
        System.out.println("SportsCar stopped.");
    }

    @Override
    public void gas(double liters) {
        fuelLevel += liters;
        System.out.println("SportsCar refueled. Fuel: " + fuelLevel + "L");
    }

    @Override
    public void startEngine() {
        engineRunning = true;
        System.out.println("SportsCar engine started!");
    }

    @Override
    public void stopEngine() {
        engineRunning = false;
        System.out.println("SportsCar engine off.");
    }

    @Override
    public boolean isEngineRunning() { return engineRunning; }
}