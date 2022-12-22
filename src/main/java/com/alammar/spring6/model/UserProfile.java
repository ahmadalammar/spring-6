package com.alammar.spring6.model;

// Java record JEP 395 introduced in Java 16+
public record UserProfile(String Id, String name, String email, String address) {
}
