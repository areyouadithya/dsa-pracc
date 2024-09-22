package adithya;

import java.util.*;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        switch(n){
            case 1,2,3,4,5 -> System.out.println("Weekday"); //break is here by default
            case 6,7 -> System.out.println("Weekend");
        }
    }
}
