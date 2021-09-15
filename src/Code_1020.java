import java.util.Scanner;

public class Code_1020 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String num = scanner.next();
		
		String[] ary = num.split("\\-");
		System.out.printf(ary[0]+ary[1]);
	}
}
