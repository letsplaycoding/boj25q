package Implementation구현;

import java.util.Scanner;

public class boj2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int max = Math.max(x, Math.max(y, z));

        if (x == y && x == z) {
            System.out.println(10000 + (1000 * x));
        } else if (x == y || x == z || y == z) {
            int same = 0;
            if (x == y || x == z) same = x;
            else same = y;
            System.out.println(1000 + (100 * same));
        } else System.out.println(max * 100);

        sc.close();
    }
}
