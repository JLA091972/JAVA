package dojo.products.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LoginUser {

    @NotEmpty(message = "Email is required!")
    @Email(message = "Please enter a valid email!")
    // @Email(regexp = ".+[@].+[\\.].+", message = "Please enter a valid email")
    private String email;

    @NotEmpty(message = "Password is required!")
    @Size(min = 8, max = 256, message = "Password must be between 8 and 256 characters")
    private String password;

    public LoginUser() {
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}