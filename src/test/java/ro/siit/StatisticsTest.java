package ro.siit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class StatisticsTest {
    StaticticsRepository repository = new StaticticsRepository();
    Calculator calculator = new Calculator();
    long minimul;
    long maximul;

    public StatisticsTest(){
        String expression = "10 cm + 1 m - 10 mm + 0.9 dm";
        long start = System.nanoTime();
        calculator.calculateFromSring(expression);
        long end = System.nanoTime();
        long time = end - start;
        minimul = time;
        if(time>maximul){
            maximul = time;
        }
        repository.addCalculationTime(time);

        expression = "10 cm + 1 m - 10 mm";
        start = System.nanoTime();
        calculator.calculateFromSring(expression);
        end = System.nanoTime();
        time = end - start;
        if(time<minimul){
            minimul = time;
        }
        if(time>maximul){
            maximul = time;
        }
        repository.addCalculationTime(time);

        expression = "10 cm + 1 m - 10 mm + 0.9 dm + 7 km + 10 mm";
        start = System.nanoTime();
        calculator.calculateFromSring(expression);
        end = System.nanoTime();
        time = end - start;
        if(time<minimul){
            minimul = time;
        }
        if(time>maximul){
            maximul = time;
        }
        repository.addCalculationTime(time);

        expression = "10 cm + 7 m - 12 km + 10 mm + 0.9 dm";
        start = System.nanoTime();
        calculator.calculateFromSring(expression);
        end = System.nanoTime();
        time = end - start;
        if(time<minimul){
            minimul = time;
        }
        if(time>maximul){
            maximul = time;
        }
        repository.addCalculationTime(time);

    }

    @Test
    public void totalComputesTest(){
        assertEquals(4, repository.getNoOfCalculations(),0);

    }

    @Test
    public void getLowestComputeTime(){
        assertEquals(minimul,repository.getLowestCalculationTime(),0);
    }


    @Test
    public void getFastestComputeTime(){
        assertEquals(maximul,repository.getFastestCalculationTime(),0);
    }
}
