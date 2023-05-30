package org.example.model;


import net.javacrumbs.jsonunit.assertj.JsonAssertions;
import org.junit.jupiter.api.*;


import static org.assertj.core.api.Assertions.assertThat;

@Tag("unit")
class UserAssertJExTest {
    User user;

    @BeforeEach
    void setup() {
        user = new User("Lynn", 40, false, "1983");
        System.out.println("setup was called");
    }

    @AfterEach
    void cleanup() {
        System.out.println("cleanup was called");
    }

    @BeforeAll
    static void setupOnce() {
        //needs to be a static method, and like all java anything accessed here needs to be static too
        System.out.println("setupOnce was called");
    }

    @AfterAll
    static void cleanupOnce() {
        System.out.println("cleanupOnce was called");
    }
    @Test
    @DisplayName("User should be at least 18 and not blocked")
    void userShouldBeAtLeast18andNotBlocked() {
        assertThat(user.age()).isGreaterThanOrEqualTo(18);
        assertThat(user.blocked())
                .as("User %s should be blocked", user.name())
                .isFalse();
        JsonAssertions.assertThatJson(user).isEqualTo("{\"name\":\"Lynn\",\"age\":40,\"blocked\":false,\"birthYear\":\"1983\"}");

    }

    @Test
    void userShouldBeLynn() {
        assertThat(user.name()).startsWith("Lyn");
    }
}