public class Main {
    public static void main(String[] args) {
        Cow cowcat = new Cow();
        Cow lioncat = new Cow("Lion Cat", 100, 1, false);
        Chicken chickfila = new Chicken();
        Chicken kfc = new Chicken("Kentucky", 2, false, 83.5);
        Pig pigge = new Pig();
        Pig elizabeth = new Pig("Red", 10, true, 567.88);
        cowcat.makeCowNoise();
        chickfila.makeChickenNoise();
        pigge.makePigNoise();
        lioncat.haveBirthday();
        kfc.eatFood(10);
        elizabeth.upgradePenSize(3);
        lioncat.displayCow();
        kfc.displayChicken();
        elizabeth.displayPig();
    }
}