import java.util.Scanner;

public class Code_1086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.printf("%.2f MB", a*b*c/8/1024/1024.0);
		}
}
