package Hero;

public class Candice extends Hero {
    // constructors
    public Candice() {
        super(this.name, this.description, this.attack, this.defense, this.speed);
    }
    // properties
    public String name = "Candice";
    public String description = "The warm-hearted ice magician.";
    public int attack = 40;
    public int defense = 90;
    public int speed = 70;
}
