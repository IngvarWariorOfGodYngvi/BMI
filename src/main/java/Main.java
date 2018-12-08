import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input you weigth in kg");
        try{
        int weigth = scanner.nextInt();}
        catch (IllegalArgumentException e){e.getMessage();
        System.out.println();


        BMICalculator calc = new BMICalculator(180,180);
        String value = calc.calculate();
        String interpret = calc.interpret();
        System.out.println(value + " " + interpret);
    }
}
