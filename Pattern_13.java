package lec2;
import java.util.*;
public class Pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int star=1;
		while(row<=2*n-1) {
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			if(row<n) {
				star++;
			}else {
				star--;
			}
			row++;
			System.out.println();
		}
	}

}
