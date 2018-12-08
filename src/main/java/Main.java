import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weight = 0;
        double height = 0;
        boolean isWeightHasRightFormat = false;
        boolean isHeightHasRightFormat = false;
        Scanner scanner = new Scanner(System.in);
        String messege = "Type some positive NUMBER";
        do {
            do {
                try {
                    System.out.println("Input your weigth in kg");
                    weight = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                }
                if (weight > 0) {
                    isWeightHasRightFormat = true;
                }
                else {
                    System.out.println(messege);
                }
            } while (isWeightHasRightFormat == false);
            do {
                try {
                    System.out.println("Input your height in cm");
                    height = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    height = 0;
                }
                if (height > 0) {
                    isHeightHasRightFormat = true;
                } else {
                    System.out.println(messege);
                }
            } while (isHeightHasRightFormat == false);
            BMICalculator calc = new BMICalculator(weight, height);
            String value = calc.calculate();
            String interpret = calc.interpret();
            System.out.println("Your BIM index is equal " + value + ". You are " + interpret);
        } while (true);
    }
}
