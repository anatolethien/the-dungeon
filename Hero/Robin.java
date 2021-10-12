package Hero;

public class Robin extends Hero {
    public Robin() {
        String name = "Robin";
        String description = "The justice-thirsty ranger.";
        int attack = 60;
        int defense = 50;
        int speed = 90;
        super(name, description, attack, defense, speed);
    }
}
