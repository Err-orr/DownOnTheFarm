public class Chicken {
    // Instance variables
    private String breed;
    private int layeggs;
    private boolean attitude;
    private double weight;
    // Default constructor
    public Chicken() {
        breed = "Unknown";
        layeggs = 0;
        attitude = false;
        weight = 0.0;
    }
    // Parameter constructor
    public Chicken(String breed, int layeggs, boolean attitude, double weight) {
        this.breed = breed;
        this.layeggs = layeggs;
        this.attitude = attitude;
        this.weight = weight;
    }
    // Methods
    public void makeChickenNoise() {
        System.out.println("CLUCK CLUCK CLUCK");
    }

    public void eatFood(int amount) {
        weight += amount;
        System.out.println("Your chicken has gained " + amount + " pounds!");
    }

    public void displayChicken() {
        System.out.println("Breed: " + breed);
        System.out.println("Eggs per day: " + layeggs);
        System.out.println("Rude: " + attitude);
        System.out.println("Weight: " + weight);
    }
}