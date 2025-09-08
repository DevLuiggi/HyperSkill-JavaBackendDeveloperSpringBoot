package codegito.simplechatbot;
import java.util.Scanner;

public class SimpleBot {
    public static int modInverse(int a, int m) {
        a = a % m;
        for (int x = 1; x < m; x++) {
            if ((a*x) % m == 1){
                return x;
            }
        }
        return 1;
    }
    public static int resolveAge(int r1, int r2, int r3){
        int[] mods = {3, 5, 7};
        int[] rest = {r1, r2, r3};

        int M = 1;
        for (int m : mods) {
            M *= m;
        }

        int x = 0;
        for (int i = 0; i < mods.length; i++) {
            int mi =  mods[i];
            int ai = rest[i];
            int Mi = M/mi; // partial product
            int inv = modInverse(Mi, mi);
            x += ai * Mi * inv;
        }
        return x % M;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int r1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int r3 = scanner.nextInt();
        int yourAge = resolveAge(r1, r2, r3);
        System.out.println("Your age is "+ yourAge +"; that's a good time to start programming!");
    }
}
