public class Skill {
    // constructors
    public Skill(String name, int power, int mana) {
        this.setName(name);
        this.setPower(power);
        this.setMana(mana);
    }
    // properties
    public String name;
    public String description;
    public int power;
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
    public int getPower() {
        return this.power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getMana() {
        return this.mana;
    }
    public void setPrecision(int mana) {
        this.mana = mana;
    }
}
