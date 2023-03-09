package JAVA.CareSoft;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantAdmin, HIPAACompliantUser {
    // ... imports class definition...

    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<>();

    // TO DO: Implement a constructor that takes an ID and a role
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    public AdminUser(int id, String role) {
        super(id);
        this.role = role;
    }

    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }

    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    @Override
    public ArrayList<String> reportSecurityIncidents() {
        return securityIncidents;


    }
    @Override
    public boolean assignPin(int pin) {
        if (pin >= 100000) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        if (this.id == confirmedAuthID ) {
            return true;
        } else {
            this.authIncident();
            return false;
        }

    }
    
    // TO DO: Setters & Getters

    
}
