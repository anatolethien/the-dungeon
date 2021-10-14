package Hero;

public class Robin extends Hero {
    // constructors
    public Robin() {
        super(this.name, this.description, this.attack, this.defense, this.speed);
    }
    // properties
    public String name = "Robin";
    public String description = "The justice-thirsty ranger.";
    public int attack = 60;
    public int defense = 50;
    public int speed = 90;
}
