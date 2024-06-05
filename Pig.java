public class Pig {
    // Instance variables
    private String color;
    private int pensize;
    private boolean mudcheck;
    private double weight;

    // Default constructor
    public Pig() {
        color = "Unknown";
        pensize = 0;
        mudcheck = false;
        weight = 0.0;
    }
    // Parameter constructor
    public Pig(String color, int pensize, boolean mudcheck, double weight) {
        this.color = color;
        this.pensize = pensize;
        this.mudcheck = mudcheck;
        this.weight = weight;
    }
    // Methods
    public void makePigNoise() {
        System.out.println("OINK OINK OINK");
    }
    public void upgradePenSize(int amount) {
        pensize += amount;
        System.out.println("The Pen Size has been increased by " + amount + ".");
    }

    public void displayPig() {
        System.out.println("Color: " + color);
        System.out.println("Pen size: " + pensize);
        System.out.println("Mud Allowed: " + mudcheck);
        System.out.println("Weight: " + weight);
    }
}