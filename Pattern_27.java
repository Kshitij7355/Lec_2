package lec2;

import java.util.Scanner;

public class Pattern_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1; 
		int star=1;
		int space = n-1;
		while(row<=n) {
			//space
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			//star
			int j = 1;
			int var=1;
			while(j<=star) {
				System.out.print(var+" ");
				if(j<=star/2) {
					var++;
				}else {
					var--;
				}
				j++;
			}
			//next row prepration
			row++;
			space--;
			star+=2;
			System.out.println();
		}
		

	}

}
