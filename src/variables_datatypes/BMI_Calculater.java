package variables_datatypes;

import java.util.Scanner;

//Real world scenario to know the difference in Variable scopes
public class BMI_Calculater {


    //static(or) class varible
    static String hosiptalName ="Manipal";

    //instance/object var outside method
    String patientName;
    int age;

    public static void main(String[] args) {

        BMI_Calculater patient = new  BMI_Calculater();

        patient.patientName ="Divya";
        patient.age=22;

patient.calculateBMI();
    }


    //Java does not support Nested methods so this method declaration should be out of main()
    public  void calculateBMI(){

        Scanner input = new Scanner(System.in);

        float heightCm;
        System.out.println("Enter Height of patient: ");
        heightCm = input.nextFloat();
        float height = heightCm / 100; //because BMI expects in meters so we are converting it to meters


        float weight;
        System.out.println("Enter Weight of patient: ");
        weight = input.nextFloat();

        float bmi = weight / (height * height);
        System.out.println("Hospital: "+hosiptalName);
        System.out.println("Name of patient: " + patientName);
        System.out.println("Age of patient: " + age);
        System.out.println("BMI is " + bmi);
    }
}
