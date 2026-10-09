package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testTemperatureConversion() {
        assertEquals(77.0, Main.celsiusToFahrenheit(25), 0.001);
    }
}

