package variables_datatypes;

public class StaticExample {
    //instance var

    String name;
    int id;

    //Static var
    static String companyName ="EY";
    static int employeeCount = 0;


    StaticExample(String name,int id){
        this.name=name;
        this.id=id;
        employeeCount++;//increments everytime a obj is created

    }

    static void displayCompanyDetails(){
            System.out.println("Company Name: "+companyName) ;//static var can be called without classname
        System.out.println("Employee Count: "+employeeCount);
    }

    void displayEmployee(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: "+id);
    }

        public static void main(String[] args) {
        StaticExample s1 = new StaticExample("Divya",1);
        StaticExample s2 = new StaticExample("Teja",2);

//calling static method
            StaticExample.displayCompanyDetails();
//calling non static methods
            s1.displayEmployee();
            s2.displayEmployee();
        }

}
