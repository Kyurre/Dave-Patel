package Assignment1;
import java.util.Scanner;

public class Fibonacci{

    // recursive method
    private static int fibonacci (int n){

        // base case
        if (n <= 1){ return n;}
        
        return fibonacci( n - 1) + fibonacci( n - 2);
    }

 
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the desired nth Fibonnaci number: ");
        
        Integer input = scan.nextInt();
        int fib = fibonacci(input);
        System.out.println("nth Fibonacci number is: " + fib);

        scan.close();
    }
}
