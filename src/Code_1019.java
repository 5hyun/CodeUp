import java.util.Scanner;

public class Code_1019 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String date = scanner.next();
		String[] ary = date.split("\\.");//split() 문자열 구분을 위한 함수
		
		int A = Integer.valueOf(ary[0]);//Integer.valueOf() 스트링을 숫자 값으로 변형
        int B = Integer.valueOf(ary[1]);
        int C = Integer.valueOf(ary[2]);
		
		System.out.printf("%04d.%02d.%02d", A, B, C);
	}
}
