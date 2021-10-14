package Hero;

public class Victor extends Hero {
    // constructors
    public Victor() {
        super(this.name, this.description, this.attack, this.defense, this.speed);
    }
    // properties
    public String name = "Victor";
    public String description = "The glorious barbarian.";
    public int attack = 90;
    public int defense = 60;
    public int speed = 50;
}
