package edu.sdccd.cisc190.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat persian;

    @BeforeEach
    void setUp() {
        persian = new Cat("Persian", 4, true, false);
    }

    @Test
    void getSound() {
        assertEquals("meow", persian.getSound());
    }

    @Test
    void isBald() {
        assertFalse(persian.isBald());
    }

    @Test
    void setBald() {
        persian.setBald(true);
        assertTrue(persian.isBald());
    }
}