package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {


    public static final String NAME = "Max";

    @Test
    public void test(){
        Assertions.assertEquals("Max",NAME);
    }

    @Test
    public void test2(){
        Assertions.assertNotEquals("Maxx",NAME);
    }
}
