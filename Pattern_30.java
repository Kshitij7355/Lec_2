package lec2;

import java.util.Scanner;

public class Pattern_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int star = n;
		int r = 5;
		while(row<=n) {
			int i = 1;
			int var=5;
			while(i<=star) {
				if(i/r==1) {
					System.out.print("* ");
				}else {
					System.out.print(var+" ");
				}
				i++;
				var--;
			}
			row++;
			r--;
			System.out.println();
		}

	}

}
