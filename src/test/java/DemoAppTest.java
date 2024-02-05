package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DemoAppTest {

    @Test
    public void testGetGreeting() {
        assertEquals("Hello, Jenkins and Maven!", DemoApp.getGreeting());
    }
}
