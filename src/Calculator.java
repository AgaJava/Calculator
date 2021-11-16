public class Calculator {
    public void add(int firstNumber, int secondNumber) {
        System.out.println("Suma to : " + (firstNumber + secondNumber));

    }

    public void sub(int firstNumber, int secondNumber) {
        System.out.println("Różnica to : " + (firstNumber - secondNumber));
    }

    public void multi(int firstNumber, int secondNumber) {
        System.out.println("Iloczyn to : " + (firstNumber * secondNumber));
    }

    public void mod(float firstNumber, float secondNumber) {
        System.out.println("Procent to : " + (firstNumber%secondNumber));
    }

    public void div(float firstNumber, float secondNumber) {
        if (secondNumber > 0) {
            System.out.println("Iloraz to : " + (firstNumber / secondNumber));
        } else {
            System.out.println("Nie można dzielić przez 0");
        }
    }
}


