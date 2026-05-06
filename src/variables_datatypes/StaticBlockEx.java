package variables_datatypes;
//A static block is used to initialize static data and runs automatically once when the class is loaded.
public class StaticBlockEx {

    static int x = 5;

    static{

        System.out.println("Static block 1");
        x = x+10;
        System.out.println("x "+ x);
    }

    static int y = x*2;

    static{
        System.out.println("Static block 2");
        y = y+10;
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);

    }
}
