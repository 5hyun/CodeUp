import java.util.Scanner;

public class Code_1024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		int len = x.length();
		for(int i = 0; i < len; i++) {
			System.out.printf("\'%c\'\n", x.charAt(i));//charAt() String���� ����� ���ڿ� �߿��� �� ���ڸ� �����ؼ� charŸ������ ��ȯ
		}
	}
}
