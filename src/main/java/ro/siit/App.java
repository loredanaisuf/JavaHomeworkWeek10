package ro.siit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StaticticsRepository repository = new StaticticsRepository();
        Calculator calculator = new Calculator();
        long start = System.nanoTime();
        calculator.calculate(3,'+', 5);
        long end = System.nanoTime();
        long time = end - start;
        repository.addCalculationTime(time);

        start = System.nanoTime();
        calculator.calculate(3,'+', 5);
        end = System.nanoTime();

        time = end - start;
        repository.addCalculationTime(time);

        start = System.nanoTime();
        calculator.calculate(3,'+', 5);
        end = System.nanoTime();

        time = end - start;
        repository.addCalculationTime(time);

        System.out.println(repository.getListOfTimes());
    }
}
