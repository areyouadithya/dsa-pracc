package adithya;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result = 0;
        while(num>0){
            int rem = num%10;
            result = 10*result + rem;
            num /= 10;
        }
        System.out.println(result);
    }
}
