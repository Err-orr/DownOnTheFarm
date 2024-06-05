public class Cow {
    // Instance variables
    private String name;
    private double weight;
    private int age;
    private boolean gender;
    // Default constructor
    public Cow() {
        name = "Unknown";
        weight = 0.0;
        age = 0;
        gender = false;
    }
    // Parameter constructor
    public Cow(String name, double weight, int age, boolean gender) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }

    // Methods
    public void makeCowNoise() {
        System.out.println("MOO MOO MOO");
    }
    public void haveBirthday() {
        age += 1;
        System.out.println("Happy Birthday!");
    }
    public void displayCow(){
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}