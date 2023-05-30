package org.example.model;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("unit")
class UserJunit5ExTest {
    User user = new User("Lynn", 40, false, "1983");

    @Test
    void userShouldBeAtLeast18() {
        assertTrue(user.age() >= 18);
    }
}