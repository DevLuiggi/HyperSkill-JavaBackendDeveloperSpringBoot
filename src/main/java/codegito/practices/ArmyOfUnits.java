package codegito.practices;

import java.util.Scanner;

public class ArmyOfUnits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n<=19 && n>0){
            System.out.println("pack");
        } else if (n<=249 && n>=20) {
            System.out.println("throng");
        } else if (n<=999 && n>=250) {
            System.out.println("zounds");
        } else if (n>=1000) {
            System.out.println("legion");
        } else {
            System.out.println("no army");
        }
    }
}
