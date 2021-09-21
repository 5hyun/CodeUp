import java.util.Scanner;

public class Code_1045 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a + b;
		int mis = a - b;
		int mul = a * b;
		int div = a / b;
		int dna = a  % b;
		double div2 = (double)a / b;
		
		System.out.println(sum);
		System.out.println(mis);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(dna);
		System.out.printf("%.2f", div2);
	}
}
