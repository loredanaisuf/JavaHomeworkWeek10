package ro.siit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorTestParametrized {
    private double a;
    private String formatA;
    private char operand;
    private double b;
    private String formatB;
    private double sum;
    private String formatSum;
    private Calculator calculator;

    @Before
    public void initialize(){
        calculator = new Calculator();
    }

    public CalculatorTestParametrized(double a, String formatA, char operand, double b, String formatB, double sum, String formatSum){
        this.a = a;
        this.formatA = formatA;
        this.operand = operand;
        this.b = b;
        this.formatB = formatB;
        this.sum = sum;
        this.formatSum = formatSum;
    }

    @Parameterized.Parameters
    public static Collection inputValues(){
        return Arrays.asList(new Object [][] {
                {2, "mm", '+', 3, "cm", 3.2 , "cm"},
                {1, "km", '-', 5, "dm", 2, "mm"},
                {3, "km", '+', 8, "km", 11, "km"}
        });
    }

    @Test
    public void CalculatorTest1(){
        double numberA = calculator.convertToMeter(a,formatA);
        double numberB = calculator.convertToMeter(b,formatB);
        double numberSum = calculator.convertToMeter(sum, formatSum);
        assertEquals(numberSum, calculator.calculate(numberA,operand,numberB),0);
    }

    @Test
    public void CalculatorTest2(){
        double numberA = calculator.convertToMeter(a,formatA);
        double numberB = calculator.convertToMeter(b,formatB);
        assertEquals(sum, calculator.convertFromMeter((calculator.calculate(numberA,operand,numberB)), formatSum),0);
    }

}
