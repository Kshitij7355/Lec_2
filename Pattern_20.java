package lec2;
import java.util.*;
public class Pattern_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int space1=3;
		int space=-1;
		while(row<=n) {
			int i = 1;
			while(i<=space1) {
				System.out.print("  ");
				i++;
			}
			System.out.print("* ");
			int j =1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			if(row>1 && row<7) {
				System.out.print("* ");
			}
			
			if(row<=n/2) {
				space1--;
				space+=2;
			}else {
				space1++;
				space-=2;
				
			}
			row++;
			System.out.println();
		}
	}
	  
}
		
	

