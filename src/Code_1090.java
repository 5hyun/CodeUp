import java.util.Scanner;

public class Code_1090 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long r = sc.nextLong();
		long n = sc.nextLong();

		for(int i=0;i<n-1;i++) {
			a*=r;
		}
		System.out.println(a);
	}
}
