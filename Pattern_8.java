package lec2;
import java.util.*;
public class Pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row=1;
		int space=n-2;
		int space1=0;
		while(row<=n) {
			int i =1;
			while(i<=space1) {
				System.out.print("  ");
				i++;
			}
			System.out.print("* ");
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			if(row!=3) {
				System.out.println("* ");
			}
			
			if(row<=n/2) {
				space-=2;
				space1++;
			}else {
				
				space+=2;
				space1--;
			}
			
			row++;
			System.out.println();
			
		}

	}

}
