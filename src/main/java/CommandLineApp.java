import picocli.CommandLine.Option;

public class CommandLineApp {

    @Option(names = "-w",description = "type your weight")
    private double weight;
    @Option(names = "-h", description = "type your height")
    private double height;


    public void run() {

        BMICalculator bmiCalculator = new BMICalculator(weight, height);
        String bmiValue = bmiCalculator.calculate();
        String value = bmiCalculator.interpret();
        System.out.println("Your BMI is " + bmiValue + " and you are "+ value);

    }


}
