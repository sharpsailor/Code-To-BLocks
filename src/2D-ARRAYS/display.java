import java.util.*;
public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i =0;i<n;i++) {
			for(int j =0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		Display(arr);
	}
	public static void Display(int[][] arr) {
		
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" "); 
			}
			System.out.println();
		}
	}

}
