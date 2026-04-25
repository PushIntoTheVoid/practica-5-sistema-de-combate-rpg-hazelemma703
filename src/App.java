import models.*;

public class App {
    public static void main(String[] args) {
        // TODO: Create some objects and test the methods here
        Warrior warrior = new Warrior("Thor", 100, 20);
        Wizard wizard = new Wizard("Merlin", 80, 25);
        Archer archer = new Archer("Legolas", 90, 18);

        warrior.attack();
        wizard.attack();
        archer.attack();
    }
}