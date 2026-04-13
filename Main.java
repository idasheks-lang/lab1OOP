public class Main {
    public static void main(String[] args) {

        Sedan sedan = new Sedan("Toyota", "Camry", 2022, "Silver");

        sedan.startEngine();
        sedan.gas(20);

        System.out.println("\n-- Overriding --");
        sedan.accelerate(30);

        System.out.println("\n-- Overloading --");
        sedan.accelerate(40, 5);
        sedan.accelerate("sport");

        sedan.stop();
        sedan.stopEngine();
        System.out.println("Engine on: " + sedan.isEngineRunning());
    }
}