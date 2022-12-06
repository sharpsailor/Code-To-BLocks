package Basics;
import java.util.*;
public class LowerUpper {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c>=97 && c<=122){
            System.out.print("lowercase");
        }else if(c>=65 && c<=90){
            System.out.print("UPPERCASE");
        }else{
            System.out.print("Invalid");
        }
    }
}
