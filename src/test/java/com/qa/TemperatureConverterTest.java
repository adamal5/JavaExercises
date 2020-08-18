package com.qa;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import com.qa.day6.TemperatureConverter;
import org.junit.Test;

public class TemperatureConverterTest {


    @Test
    public void test1() {
        TemperatureConverter temp = new TemperatureConverter();
            assertTrue(50.0 == temp.convertCelsiusToFahrenheit(100));
        }
    }



