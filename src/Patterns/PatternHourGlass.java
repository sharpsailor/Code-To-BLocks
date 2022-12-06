package Patterns;

import java.util.*;

public class PatternHourGlass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = 0;
        int star = 2 * n + 1;
        int val = n;
        while (row <= 2 * n + 1) {
            int i = 1;
            while (i <= space) {
                System.out.print("   ");
                i++;
            }
            int j = 1;
            int p = val;
            while (j <= star) {
                System.out.print(p + "  ");

                if (j <= star / 2) {
                    p--;
                } else {
                    p++;
                }
                j++;
            }
            if (row <= n) {
                star -= 2;
                space++;
                val--;
            } else {
                star += 2;
                space--;
                val++;
            }
            row++;
            System.out.println();

        }
    }
}
