package adithya;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 0;

        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println("The "+n+"th Fibonacci number is "+b);
    }
}
