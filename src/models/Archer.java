package models;

public class Archer extends Character {

    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void attack() {
        System.out.println(getName() + " shoots an arrow with power " + getAttackPower() + "!");
    }
}
