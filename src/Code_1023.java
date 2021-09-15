import java.util.Scanner;

public class Code_1023 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String x = scanner.next();
		String[] ary = x.split("\\.");
		System.out.println(ary[0]);
		System.out.println(ary[1]);
	}
}
