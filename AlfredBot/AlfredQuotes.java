import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        String greetMessage = String.format("Hello %s, Welcome back", name);
        return (greetMessage);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "It is currently "+ date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        String comment;
        if (conversation.contains("Alexis")){
            comment = "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.contains("Alfred")){
            comment = "At your service. As you wish, naturally.";
        } else {
            comment = " Right. And with that I shall retire";
        }

        return (comment);
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
}


