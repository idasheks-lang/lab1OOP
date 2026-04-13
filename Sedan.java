public class Sedan extends Vehicle implements Automobile {

    private double fuelLevel;
    private boolean engineRunning;

    public Sedan(String make, String model, int year, String color) {
        super(make, model, year, color);
        this.fuelLevel = 50.0;
        this.engineRunning = false;
    }

    // Overriding
    @Override
    public void accelerate(double amount) {
        setCurrentSpeed(getCurrentSpeed() + amount);
        System.out.println("[Override] Sedan speed: " + getCurrentSpeed() + " km/h");
    }

    // Overloading
    public void accelerate(double amount, int seconds) {
        setCurrentSpeed(getCurrentSpeed() + amount);
        System.out.println("[Overload] Reached " + getCurrentSpeed() + " km/h in " + seconds + "s");
    }

    public void accelerate(String mode) {
        setCurrentSpeed(getCurrentSpeed() + (mode.equalsIgnoreCase("sport") ? 50 : 20));
        System.out.println("[Overload - " + mode + " mode] Speed: " + getCurrentSpeed() + " km/h");
    }

    @Override
    public void stop() {
        setCurrentSpeed(0);
        System.out.println("Sedan stopped.");
    }

    @Override
    public void gas(double liters) {
        fuelLevel += liters;
        System.out.println("Sedan refueled. Fuel: " + fuelLevel + "L");
    }

    @Override
    public void startEngine() {
        engineRunning = true;
        System.out.println("Sedan engine started.");
    }

    @Override
    public void stopEngine() {
        engineRunning = false;
        System.out.println("Sedan engine stopped.");
    }

    @Override
    public boolean isEngineRunning() { return engineRunning; }

    public double getFuelLevel() { return fuelLevel; }
}