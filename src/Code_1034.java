import java.util.Scanner;

public class Code_1034 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		int a = Integer.valueOf(x, 8);
		
		System.out.printf("%d", a);
	}
}
