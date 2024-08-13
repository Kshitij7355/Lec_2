package Lec2;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		if(age>=18) {
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println("Not Eligible");
		}

	}

}
