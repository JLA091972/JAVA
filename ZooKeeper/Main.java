package JAVA.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        Gorilla Grod = new Gorilla();
        Grod.throwSomething("rock");
        System.out.printf("\tNew energy level: %s \n",Grod.displayEnergyLevel());
        Grod.throwSomething("branch");
        System.out.printf("\tNew energy level: %s \n",Grod.displayEnergyLevel());
        Grod.throwSomething("fruit");
        System.out.printf("\tNew energy level: %s \n",Grod.displayEnergyLevel());
        
        Grod.eatBanana();
        System.out.printf("\tNew energy level: %s \n",Grod.displayEnergyLevel());
        Grod.eatBanana();
        System.out.printf("\tNew energy level: %s \n",Grod.displayEnergyLevel());

        Grod.climb();
        System.out.printf("\tNew energy level: %s \n",Grod.displayEnergyLevel());



        Bat Morbius = new Bat();
        Morbius.attackTown();
        System.out.printf("\tNew energy level: %s \n",Morbius.displayEnergyLevel());
        Morbius.attackTown();
        System.out.printf("\tNew energy level: %s \n",Morbius.displayEnergyLevel());
        Morbius.attackTown();
        System.out.printf("\tNew energy level: %s \n",Morbius.displayEnergyLevel());
        Morbius.eatHuman();
        System.out.printf("\tNew energy level: %s \n",Morbius.displayEnergyLevel());
        Morbius.eatHuman();
        System.out.printf("\tNew energy level: %s \n",Morbius.displayEnergyLevel());
        Morbius.fly();
        System.out.printf("\tNew energy level: %s \n",Morbius.displayEnergyLevel());
        Morbius.fly();
        System.out.printf("\tNew energy level: %s \n",Morbius.displayEnergyLevel());


    }
}
