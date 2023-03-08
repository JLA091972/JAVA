package JAVA.CafeBusiness;

import java.util.ArrayList;

// Create a CafeUtil class and a testing file.
// Implement the getStreakGoal method and test.
// Implement the printPriceChart method and test.
// Implement the getOrderTotal method and test.
// Implement the displayMenu method and test.
// Implement the addCustomer method and test.

public class CafeUtil {
    
    public int getStreakGoal(int numWeeks ){
        int sum = 0;

        for (int i=0; i<=numWeeks ; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double total=0;
        for (int i=0; i<prices.length; i++){
            // System.out.println(prices[i]);
            total += prices[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (int i=0; i<menuItems.size();i++){
            System.out.println("\t"+ i + " "+ menuItems.get(i));
        }
    }
    
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s",userName);
        System.out.printf("There are %d in front of you \n",customers.size());
        customers.add(userName);
        System.out.println(customers);

    }

}
