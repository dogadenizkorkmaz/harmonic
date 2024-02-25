import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     Scanner doa = new Scanner(System.in); //define scanner
        System.out.print("Enter the Number: ");
        int n=doa.nextInt(); //get value from user

        double result = 0;

        for (double i=1; i<=n; i++) {
            result += (1/i);
            //First Loop (for 2), i=1; result = 0 + (1/1) = 1
            //First Loop (for 2), i=2; result = 1 + (1/2) = 1,5
        }
        System.out.println(result);
    }
}
