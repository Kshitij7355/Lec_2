package Lec2;

import java.util.Scanner;

public class Simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int p =s.nextInt();
		int r = s.nextInt();
		int t = s.nextInt();
		int si = (p*r*t)/100;
		System.out.println(si);

	}

}
