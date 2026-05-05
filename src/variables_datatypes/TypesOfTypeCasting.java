package variables_datatypes;

//converting variable of one data type to another
//two types: implicit and Explicit

public class TypesOfTypeCasting {

    public static void main(String[] args) {
        int a = 10;
        double a1 = a;//small → Big

        System.out.println("-------Implicit(Widening) conversion---------");
        System.out.println("Integer : "+a);
        System.out.println("Double : "+a1);

        int a2 = (int) a1; //big → small
        System.out.println("---------Explicit(Narrowing) conversion-----------");
        System.out.println("Integer : "+a2);

        //character conversion
        System.out.println("--------Character Conversion--------");
        char c = 'Z';
        System.out.println("Character : "+c);
        int c1 = (int) c;
        System.out.println("ASCII value of Character: "+c1);

        //Division Logic
        System.out.println("-------Division Logic-------");
        int x = 7;
        int y = 2;
        double result1 =x/y;
        double result = (double)x/y;

        System.out.println("result without explicit conversion: "+result1);
        System.out.println("result with explicit conversion: "+result);

        //Overflow Example
        System.out.println("------Overflow------");
        int i = 150;
        byte b = (byte)i;
        System.out.println("Value: "+b);//Negative value because of oveflow

        //Example
        System.out.println("---------Example--------");
        int x1 = 10;
        int y1 = 3;

        System.out.println(x1 / y1);
        System.out.println((double)x1 / y1);
        System.out.println(x1 / (double) y1);
        System.out.println((double)(x1 / y1));




    }
}
