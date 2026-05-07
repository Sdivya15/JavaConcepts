package control_statements;

import java.util.Scanner;

/*
Task:
Take grade input (A-D) and return:
A -> Excellent
B -> Good
C -> Average
D -> Fail

Twist:
- Use switch expression (->)
- Store result in variable
- Handle lowercase also
- No if-else
*/

public class SwitchExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a grade (A-D): ");

        String letter = input.nextLine();

        String result = switch (letter) {

            case "A", "a" -> "Excellent";

            case "B", "b" -> "Good";

            case "C", "c" -> "Average";

            case "D", "d" -> "Fail";

            default -> "Invalid Grade";
        };

        System.out.println(result);

        input.close();
    }
}