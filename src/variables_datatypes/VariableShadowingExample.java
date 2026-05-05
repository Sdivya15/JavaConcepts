package variables_datatypes;

//a variable declared inside a certain scope has the same name
// as a variable in an outer scope
public class VariableShadowingExample {

    int a = 10; //Instance variable

    static int b = 1;//Static variable

    public static void main(String[] args) {
        VariableShadowingExample example = new VariableShadowingExample();
        example.show();

        }

        void show(){
        int a = 20;
        int b = 2;
            System.out.println("Local variable: "+ a);
            System.out.println("Instance variable without this keyword: "+ a);
            System.out.println("Instance variable using this keyword: "+ this.a);

            System.out.println("Local variable:" +b);
            System.out.println("Static variable: "+ b);
            System.out.println("Static Variable "+ VariableShadowingExample.b);

    }
}
