import java.util.Scanner;

public class Code_1074 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i=x;i>0;i--) {
			System.out.println(x);
			x--;
		}
	}
}
