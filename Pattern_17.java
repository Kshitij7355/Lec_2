package lec2;
import java.util.*;
public class Pattern_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int row=1;
		int n = s.nextInt();
		int star=3;
		int space=1;
		while(row<=n) {
			int i =1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k =1;
			while(k<=star) {
				System.out.print("* ");
				k++;
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
