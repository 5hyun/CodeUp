import java.util.Scanner;

public class Code_1019 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String date = scanner.next();
		String[] ary = date.split("\\.");//split() ���ڿ� ������ ���� �Լ�
		
		int A = Integer.valueOf(ary[0]);//Integer.valueOf() ��Ʈ���� ���� ������ ����
        int B = Integer.valueOf(ary[1]);
        int C = Integer.valueOf(ary[2]);
		
		System.out.printf("%04d.%02d.%02d", A, B, C);
	}
}
