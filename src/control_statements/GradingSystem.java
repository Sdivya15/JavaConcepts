package control_statements;

import java.util.Scanner;
//Task:
//
//Write a program that:
//
//Takes an integer marks (0–100)
//Prints grade based on:
//90+ → A
//75–89 → B
//50–74 → C
//<50 → FAIL
//Twist:
//If marks is exactly divisible by 5, upgrade grade by one level
//(C → B, B → A, A stays A)
//If marks is negative or >100, print "INVALID"
//Use:
//Only one if-else ladder (no multiple separate ifs)
//No extra variables for grade
public class GradingSystem {

    int marks;

    void getDetails(Scanner input) {

        System.out.print("Enter marks: ");
        marks = input.nextInt();
    }

    void display() {

        if (marks < 0 || marks > 100) {

            System.out.println("INVALID");

        }
        else if (marks >= 90 || (marks >= 75 && marks <= 89 && marks % 5 == 0)) {

            System.out.println("Grade A");

        }
        else if ((marks >= 75 && marks <= 89) ||
                (marks >= 50 && marks <= 74 && marks % 5 == 0)) {

            System.out.println("Grade B");

        }

        else if (marks >= 50 && marks <= 74) {

            System.out.println("Grade C");

        }
        else {

            System.out.println("FAIL");

        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        GradingSystem student = new GradingSystem();

        student.getDetails(input);
        student.display();

        input.close();
    }
}