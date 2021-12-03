
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the action +, -, *, /");
        String act = scanner.nextLine();
        if ("+".equals(act)) {
            int sum = (first + second);
            System.out.println(first + " + " + second + " = " + sum);
        }
        if ("-".equals(act)) {
            int subt = (first - second);
            System.out.println(first + " - " + second + " = " + subt);
        }
        if ("-".equals(act)) {
            int mult = (first * second);
            System.out.println(first + " * " + second + " = " + mult);
        }
        if ("-".equals(act)) {
            double div = ((double) first / second);
            System.out.println(first + " / " + second + " = " + div);
        }
        else {
            System.out.println("Incorrect action!");
        }

    }
}