package control_statements;

import java.util.Scanner;

//Calculater
public class SwitchExample2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = input.nextInt();
        System.out.println("Enter any operator: ");
        char operator = input.next().charAt(0);

        int result = switch(operator){
            case '+' -> num1 + num2;


            case '-' -> num1 - num2;


            case '*' -> num1 * num2;


            case '/' ->{
                yield (num2 == 0) ? 0 : num1 / num2;// yield is used to return a value from switch block
            }
            default ->  0;
        };

        System.out.println(result);
    }
}
