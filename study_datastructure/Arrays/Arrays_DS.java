package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays_DS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> ar = new ArrayList<>();
		for(int i=0; i<n; i++){
			int num = sc.nextInt();
			ar.add(num);
		}
		for(int i=n-1; i>=0; i--){
			System.out.print(ar.get(i)+" ");
		}
	}
}
