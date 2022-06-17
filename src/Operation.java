import java.util.Scanner;
public class Operation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int subtract;
        int add;
        int multiplication;
        int division;
        System.out.println("Enter first integer");
        number1 = input.nextInt();
        System.out.println("Enter second integer");
        number2 = input.nextInt();

        subtract = number1 - number2;
        add = number1 + number2;
        multiplication = number1 * number2;
        division = number1 / number2;


        System.out.printf("subtract is %d%n add is %d%n multiplication is %d%n division is %d%n",  subtract, add, multiplication, division);





    }











}


