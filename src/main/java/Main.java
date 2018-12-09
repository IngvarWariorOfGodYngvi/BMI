import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weight = 0;
        double height;
        boolean isWeightHasRightFormat = false;
        boolean isHeightHasRightFormat = false;
        final int EXIT_NUMBER = -123321;
        Scanner scanner = new Scanner(System.in);
        String message = "Type some positive NUMBER";
        String EXIT = "EXIT";
        mainloop:do {
            do {
                try {
                    System.out.println("Input your weigth in kg");
                    weight = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                }
                if(weight==EXIT_NUMBER){
                    System.out.println(EXIT);
                    break mainloop;}
                if (weight > 0) {
                    isWeightHasRightFormat = true;
                } else {
                    System.out.println(message);
                }
            } while (!isWeightHasRightFormat);
            do {
                try {
                    System.out.println("Input your height in cm");
                    height = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    height = 0;
                }
                if(height==EXIT_NUMBER){
                    System.out.println(EXIT);
                    break mainloop;}

                if (height > 0) {
                    isHeightHasRightFormat = true;
                } else {
                    System.out.println(message);
                }
            } while (!isHeightHasRightFormat);
            BMICalculator calc = new BMICalculator(weight, height);
            String value = calc.calculate();
            String interpret = calc.interpret();
            System.out.println("Your BIM index is equal " + value + ". You are " + interpret + "\n");
            weight=0;
            height=0;
            isWeightHasRightFormat = false;
            isHeightHasRightFormat = false;
        } while (true);
    }
}
