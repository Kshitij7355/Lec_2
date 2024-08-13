package lec2;
import java.util.*;
public class Pattern_16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int star = n;
		int space=n-1;
		while(row<=2*n-1) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j =1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			if(row<=n-1) {
				star--;
				space--;
			}else {
				star++;
				space++;
			}
			row++;
			System.out.println();
		}

	}

}
