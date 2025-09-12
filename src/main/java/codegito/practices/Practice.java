package codegito.practices;

import java.util.Scanner;
import java.math.*;
public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days =  scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        if(isWeekend && days <= 25 && days >= 15){
            System.out.println(true);
        } else System.out.println(!isWeekend && days <= 20 && days >= 10);
        scanner.close();
    }
}
