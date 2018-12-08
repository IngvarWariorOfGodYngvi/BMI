import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class BMICalculatorTest {

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "fakeValues")
    public void constructTest(double weight, double height) {
        new BMICalculator(weight,height);
    }

    @Test
    @Parameters(method = "rightValues")
    public void testCalculate(double weight, double height, String exp) {
        Calculator calc = new BMICalculator();
        assertEquals(exp, calc.calculate());
    }

    @Test
    @Parameters({"10, very severely underweight",
            "15.5, severely underweight",
            "17, underweight"})
    public void interpretTest(String bmi, String label) {
        Calculator calc = new BMICalculator();
        assertEquals(label, calc.interpret());
    }

    private Object[] fakeValues() {
        return new Object[]{
                new Object[]{-1, 170},
                new Object[]{1, -1},
                new Object[]{0, 120},
                new Object[]{50, -1}};
    }

    private Object[] rightValues() {
        return new Object[]{
                new Object[]{40, 120, "27.8"},
                new Object[]{50, 120, "34.7"}};
    }
    private Object[] intrpret(){
        return new Object[]{
                new Object[]{10,"Very severely underweight"},
                new Object[]{15,"Severely underweight"},
                new Object[]{16,"Underweight"},
                new Object[]{18.5,"Normal (healthy weight)"},
                new Object[]{25,"Overweight"},
                new Object[]{30,"Obese Class I (Moderately obese)"},
                new Object[]{35,"Obese Class II (Severely obese)"},
                new Object[]{40,"Obese Class III (Very severely obese)"},
                new Object[]{45,"Obese Class IV (Morbidly Obese)"},
                new Object[]{50,"Obese Class V (Super Obese)"},
                new Object[]{60,"Obese Class VI (Hyper Obese)"},
        };
    }


}
