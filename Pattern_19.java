package lec2;
import java.util.*;
public class Pattern_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int star=4;
		int space=-1;
		while(row<=n) {
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int k = 1;
			while(k<=space) {
				System.out.print("  ");
				k++;
			}
			int j = 1;
			if(row==1 || row==7) {
				j=2;
			}
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			if(row<=n/2) {
				star--;
				space+=2;
			}else {
				star++;
				space-=2;
			}
			row++;
			System.out.println();
			
		}

	}

}
