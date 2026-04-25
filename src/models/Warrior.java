package models;

public class Warrior extends Character {

    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void attack() {
        System.out.println(getName() + " swings a sword with power " + getAttackPower() + "!");
    }
}