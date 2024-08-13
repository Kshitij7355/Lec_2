package Lec2;

import java.util.Scanner;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int row =0;
		int star =1;
		
		while(row<n) {
			int nco=1;
			int i =0;
			while(i<star) {
				System.out.print(nco);
				nco=(nco*(row-i)/(i+1));
				i++;
			}
			System.out.println();
			row++;
			star++;
		}
		

	}

}
