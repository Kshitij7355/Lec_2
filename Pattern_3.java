package lec2;
import java.util.*;
public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int star = n;
		while(row<=n) {
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			row++;
			star--;
			System.out.println();
		}

	}

}
