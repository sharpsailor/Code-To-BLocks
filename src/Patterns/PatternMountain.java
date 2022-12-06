package Patterns;

import java.util.*;

public class PatternMountain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 1;
        int space = n + 1;
        while (row <= n) {
            int i = 1;
            int val = 1;
            while (i <= star) {
                System.out.print(val + " ");
                i++;
                val++;
            }
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            int k = 1;
            val = star;
            if (row == n) {
                k = 2;
                val = star - 1;
            }
            while (k <= star) {
                System.out.print(val + " ");
                k++;
                val--;
            }
            System.out.println();
            row++;
            space -= 2;
            star++;
        }
    }
}
