package variables_datatypes;

//This output will be same for all the objects
//Because There is only one 'a' in the memory and all the objects are modifying the same 'a'
public class Counter {

    //without static each object will get its own copy of 'a'
    static int a = 0;

    void increment(){
        a ++;
    }

    void display(){
        System.out.println(a);
    }

    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        counter1.increment();
        counter2.increment();
        counter3.increment();

        counter1.display();
        counter2.display();
        counter3.display();

    }
}
