// FIBONACCI SERIES

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER YOU WANT TO PRINT FIBONACCI SERIES : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        for (int i=1; i<=n; i++){
            c = a+b;
            System.out.println(c); // YOU WRITE THIS LINE ANYWHERE ABOVE AND BELOW
            a=b;
            b=c;
        }
    }
}
