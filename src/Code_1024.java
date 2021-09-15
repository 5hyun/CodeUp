import java.util.Scanner;

public class Code_1024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		int len = x.length();
		for(int i = 0; i < len; i++) {
			System.out.printf("\'%c\'\n", x.charAt(i));//charAt() String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환
		}
	}
}
