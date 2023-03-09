package JAVA.ZooKeeper;

public class Gorilla extends Mammal {

    public void throwSomething(String item){
        int energyLevel = displayEnergyLevel();
        this.setEnergyLevel(energyLevel -= 5);
        System.out.printf("Gorilla threw %s ...loose 5 energy level", item);

    }

    public void eatBanana(){
        int energyLevel = displayEnergyLevel();
        this.setEnergyLevel(energyLevel += 10);
        System.out.printf("Gorilla eat banana... power up 10 energy level");
    }
    
    public void climb(){
        int energyLevel = displayEnergyLevel();
        this.setEnergyLevel(energyLevel -= 10);
        System.out.printf("Gorilla climb a tree... loose 10 energy level");
    }


}
