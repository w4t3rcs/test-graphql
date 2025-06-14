package io.w4t3rcs.testgraphqll;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
public class UserInput {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDate birthDate;

    public User toUser() {
        return new User(null, firstName, lastName, email, password, birthDate);
    }
}
