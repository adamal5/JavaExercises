package com.qa;
import com.qa.day2.Calculator;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    Calculator cal = new Calculator();

    @Test
    public void test1(){
        assertTrue(cal.addition(5,6)== 11);
    }

    @Test
    public void test2(){
        assertTrue(cal.multiplication(2,3)== 6);
    }

    @Test
    public void test3(){
        assertTrue(cal.division(6,12)== 2);
    }

    @Test
    public void test4(){
        assertTrue(cal.division(12,10)== 0);
    }

    @Test
    public void test5(){
        assertTrue(cal.subtraction(10,5)== 5);
    }

}
