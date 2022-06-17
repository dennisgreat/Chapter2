import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("print first number: ");
        number1 = input.nextInt();
        System.out.println("print second number");
        number2 = input.nextInt();
        if (number1 == number2);
        System.out.printf("%d == %d%n", number1,number2);
        if (number1 > number2);
        System.out.printf("%d > %d%n", number1, number2);
        if (number1 != number2);
        System.out.printf("%d != %d%n", number1, number2);
        if (number1 < number2);
        System.out.printf("%d < %d%n", number1, number2);
        if (number1 >= number2);
        System.out.printf("%d >= %d%n", number1, number2);
        if (number1 <= number2);
        System.out.printf("%d <= %d%n", number1, number2);
    }
}


