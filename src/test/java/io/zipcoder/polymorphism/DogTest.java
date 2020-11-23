package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Test;

public class DogTest extends TestCase {

    public void testSpeak() {
        //given
        Dog dog = new Dog("Fido");

        //when
        String actual = dog.speak();
        String expected = "Bark";

        assertEquals(expected, actual);
    }
}