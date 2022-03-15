package personnage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorcierTest {
    @Test
    public void age_WhatYouSetIsWhatYouGet()  {
        //given
        Sorcier sorcier = new Sorcier("Agrippa");

        for (int age = 0; age < 100; age++) {
            //when
            sorcier.setAge(age);

            //then
            assertEquals(sorcier.getAge(), age);
        }
    }
}