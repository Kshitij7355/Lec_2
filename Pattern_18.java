package lec2;
import java.util.*;
public class Pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row=1;
		int space=3;
		int star=1;
		while(row<=n) {
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
			if(row<=n/2) {
				star+=2;
				space--;
			}else {
				star-=2;
				space++;
			}
			row++;
			System.out.println();
		}
		

	}

}
