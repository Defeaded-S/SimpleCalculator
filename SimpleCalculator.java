
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int sum = (first + second);
        int subt = (first - second);
        int mult = (first * second);
        double div = ((double) first / second);
        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + subt);
        System.out.println(first + " * " + second + " = " + mult);
        System.out.println(first + " / " + second + " = " + div);

    }
}
