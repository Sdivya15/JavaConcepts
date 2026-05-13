package control_statements;

//1
//33
//555
//7777
//99999
public class OddNumberTriangle {
    public static void main(String[] args) {
        int num =1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num +" ");

            }
            num +=2;
            System.out.println();
        }
    }
}
