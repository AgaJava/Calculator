import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj znak działania + / - / : / */ % /");
        String znak = scanner.next();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        if (znak.equals ("+")) {
            System.out.println(firstNumber + secondNumber);
        } else if (znak.equals("-")) {
            System.out.println(firstNumber - secondNumber);
        } else if (znak.equals("*")) {
            System.out.println(firstNumber*secondNumber);
        } else if (znak.equals("/")){
            System.out.println(firstNumber/secondNumber);
        } else  {
            System.out.println(firstNumber%secondNumber);
        }
    }
}
