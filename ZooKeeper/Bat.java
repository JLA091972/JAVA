package JAVA.ZooKeeper;

public class Bat extends Mammal {

    public Bat() {
        this.setEnergyLevel(300);
    }
    public void fly(){
        int energyLevel = displayEnergyLevel();
        this.setEnergyLevel(energyLevel -= 50);
        System.out.printf("flap flap bat taking off ...loose 50 energy level");
    }

    public void eatHuman(){
        int energyLevel = displayEnergyLevel();
        this.setEnergyLevel(energyLevel += 25);
        System.out.printf("Bat eat human..well..never mind +25 energy level");
    }
    public void attackTown(){
        int energyLevel = displayEnergyLevel();
        this.setEnergyLevel(energyLevel -= 100);
        System.out.printf("Bat attack town.. on fire... -100 energy level");
    }

}
