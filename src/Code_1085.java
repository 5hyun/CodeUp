import java.util.Scanner;

public class Code_1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		System.out.printf("%.1f MB", (a*b*c*d)/1024*8.0);
	}
}
