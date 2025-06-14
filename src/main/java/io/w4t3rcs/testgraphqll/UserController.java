package io.w4t3rcs.testgraphqll;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @QueryMapping
    public Iterable<User> users() {
        return userRepository.findAll();
    }

    @QueryMapping
    public User userById(@Argument Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @QueryMapping
    public User userByEmail(@Argument String email) {
        return userRepository.findByEmail(email).orElseThrow();
    }
}
