package org.example.model;

import java.time.LocalDate;

public record User(String name, Integer age, Boolean blocked, String birthYear) {
}
