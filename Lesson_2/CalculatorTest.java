import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Программа калькулятор.\n");
        String userResponse;

        do {
            System.out.print("Введите первое число: ");
            calculator.setA(scanner.nextInt());
            System.out.print("Введите математическую операцию: ");
            calculator.setMathOperation(scanner.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setB(scanner.nextInt());
            calculator.calculate();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userResponse = scanner.next().toLowerCase();
            } while(!(userResponse.equals("yes") || userResponse.equals("no")));
        } while(userResponse.equals("yes"));
    }
}