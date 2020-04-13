package ro.siit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorTest.class,
        CalculatorTestParametrized.class,
})
public class SuiteTest {
}
