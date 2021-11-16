import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        Calculator addition = new Calculator();
        addition.add(firstNumber,secondNumber);

        Calculator substraction = new Calculator();
        substraction.sub(firstNumber,secondNumber);

        Calculator multiplication = new Calculator();
        multiplication.multi(firstNumber,secondNumber);

        Calculator division = new Calculator();
        division.div(firstNumber,secondNumber);

       /* int addition = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = firstNumber/secondNumber;
        float mod = firstNumber%secondNumber;*/


       /* int result = firstNumber + secondNumber;
        System.out.println("dodawanie " +addition);

        int result1 = firstNumber - secondNumber;
        System.out.println("odejmowanie " +substraction);

        int result2 = firstNumber * secondNumber;
        System.out.println("mnożenie " +multiplication);

        float result3 = firstNumber/secondNumber;
        System.out.println("dzielenie " + division);

        float result4 = secondNumber % firstNumber;
        System.out.println("procent " + mod);*/

    }
}
