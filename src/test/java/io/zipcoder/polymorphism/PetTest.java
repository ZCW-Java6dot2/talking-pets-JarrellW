package io.zipcoder.polymorphism;

import junit.framework.TestCase;

public class PetTest extends TestCase {

    public void testTestGetName() {
        Dog dog = new Dog("Dogo");

        String actual = dog.getName();
        String expected = "Dogo";

        assertEquals(expected, actual);
    }

    public void testTestSetName() {
        Dog dog = new Dog("Dogo");

        dog.setName("Fido");
        String actual = dog.getName();
        String expected = "Fido";

        assertEquals(expected, actual);
    }

}