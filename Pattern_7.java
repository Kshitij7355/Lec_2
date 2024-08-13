package lec2;
import java.util.*;
public class Pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row=1;
		int star=5;
		int space=3;
		while(row<=n) {
			int i =1;
			while(i<=star) {
				if(row==1 || row==5) {
					System.out.print("* ");
					i++;
				}else {
					System.out.print("* ");
				}
				
			}
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
				System.out.print("* ");
			}
			
			row++;
			System.out.println();
		}
		

	}

}
