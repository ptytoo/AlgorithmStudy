package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Left_Rotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		ArrayList<Integer> ar = new ArrayList<>();
		for(int i=0; i<n; i++){
			ar.add(sc.nextInt());
		}
		for(int i=d; i<n; i++){
			System.out.print(ar.get(i)+" ");
		}
		for(int i=0; i<d; i++){
			System.out.print(ar.get(i)+" ");
		}
	}
}
