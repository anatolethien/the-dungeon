package Hero;

public class Hero {
    // constructors
    public Hero(String name, String description, int attack, int defense, int speed) {
        this.setName(name);
        this.setDescription(description);
        this.setAttack(attack);
        this.setDefense(defense);
        this.setSpeed(speed);
        this.setHp(100);
        this.setMana(1);
    }
    // properties
    public String name;
    public String description;
    public int attack;
    public int defense;
    public int speed;
    public int hp;
    public int mana;
    // methods
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getAttack() {
        return this.attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getDefense() {
        return this.defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public int getSpeed() {
        return this.speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getHp() {
        return this.hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getMana() {
        return this.mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
}
