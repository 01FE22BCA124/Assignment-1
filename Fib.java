/**
 * The Fibb class contains a static method that calculates the nth Fibonacci number recursively and a
 * main method that takes user input and prints the result.
 */
import java.util.*;
/**
 * The Fibb class contains a static method that calculates the nth Fibonacci number recursively.
 */
class Fib{
    static int fib(int n)
    {
        if (n==0)
            return 0;
      else if(n==1 || n==2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
 
   /**
    * The main function takes an input integer, calculates the Fibonacci number at that position, and
    * prints the result.
    * 
    * @param args The args parameter is an array of strings that can be passed as command line
    * arguments when running the program. In this case, it is not being used in the main method.
    */
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
        sc.close();
    }
}
     

    

