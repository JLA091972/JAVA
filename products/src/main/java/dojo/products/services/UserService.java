package dojo.products.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import dojo.products.models.LoginUser;
import dojo.products.models.User;
import dojo.products.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
        System.out.println(newUser);
        // TO-DO - Reject values or register if no errors:
        // Reject if email is taken (present in database)
        if (userRegistered(newUser.getEmail())) {
            result.rejectValue("email", "Email", "email taken");
            return null;
        }
        // Reject if password doesn't match confirmation
        if (!newUser.getPassword().equals(newUser.getConfirm())) {
            result.rejectValue("confirm", "Confirm", "passwords must match");
            return null;
        }

        // Return null if result has errors
        if (result.hasErrors()) {
            return null;
        }

        // Hash and set password, save user to database
        String hashedpw = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        newUser.setPassword(hashedpw);
        return userRepository.save(newUser);
    }

    public User login(LoginUser newLoginObject, BindingResult result) {

        // Find user in the DB by email
        // Reject if NOT present
        if (!userRegistered(newLoginObject.getEmail())) {
            result.rejectValue("email", "EmailLogin", "Invalid Credentials");
            return null;
        }
        User user = findUserByEmail(newLoginObject.getEmail());
        // Reject if BCrypt password match fails
        if (!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
            result.rejectValue("password", "Password", "Invalid Credentials");
            return null;
        }
        // Return null if result has errors
        if (result.hasErrors()) {
            return null;
        }
        // Otherwise, return the user object
        return user;
    }

    private boolean userRegistered(String email) {
        Optional<User> user = userRepository.findByEmail(email);
        return user.isPresent();
    }

    private User findUserByEmail(String email) {
        Optional<User> user = userRepository.findByEmail(email);
        return user.orElse(null);

    }
}