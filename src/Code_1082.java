import java.util.Scanner;

public class Code_1082 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.nextLine();
		
		for(int i=1; i<16; i++) {
			int a = Integer.parseInt(x, 16);//16진수를 10진수로 전환
			String res = Integer.toHexString(a*i).toUpperCase();
			String num = Integer.toHexString(i).toUpperCase();
			System.out.printf("%s*%s=%s\n", x, num, res);
		}
		
	}
}
