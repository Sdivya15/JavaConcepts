package variables_datatypes;

//converting variable of one data type to another
//two types: implicit and Explicit

public class TypesOfTypeCasting {

    public static void main(String[] args) {
        int a = 10;
        double a1 = a;//small → Big

        System.out.println("Implicit(Widening) conversion:");
        System.out.println("Integer : "+a);
        System.out.println("Double : "+a1);

        int a2 = (int) a1; //big → small
        System.out.println("Explicit(Narrowing) conversion:");
        System.out.println("Integer : "+a2);
    }
}
