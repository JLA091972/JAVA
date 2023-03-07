public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double coffeePrice = 4.99;
        double lattePrice = 3.99;
        double cappuccinoPrice = 3.99;

    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;        
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //

        String order = isReadyOrder1 ? "ready" :"not ready";
        String message = String.format("%s, your order is %s",customer1,order);
        System.out.println(message);

        order = isReadyOrder2 ? "ready" :"not ready";
        message = String.format("%s, your order is %s total for 2 lattes is %f",customer2, order, lattePrice * 2  );
        System.out.println(message);

        order = isReadyOrder3 ? "ready" :"not ready";
        message = String.format("%s, your order is %s",customer3,order);        
        System.out.println(message);
        double difference = coffeePrice - lattePrice;
        message= String.format("You need to pay %f for the difference", difference);
        System.out.println(message);


        order = isReadyOrder4 ? "ready" :"not ready";
        message = String.format("%s, your order is %s",customer4,order);        
        System.out.println(message);




    }
}
