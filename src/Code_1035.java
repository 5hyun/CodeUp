import java.util.Scanner;

public class Code_1035 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		int a = Integer.valueOf(x, 16);
		
		System.out.printf("%o", a);
	}
}
