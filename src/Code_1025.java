import java.util.Scanner;

public class Code_1025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int len = (int)Math.log10(x) + 1;
		int ary[] = new int [len];
		
		for(int i = 0; i < len; i++) {
			ary[i] = x % (int)Math.pow(10, i+1);
		}
		
		for(int i = len - 1; i > 0; i--) {
			int n = ary[i] - ary[i-1];
			System.out.println("[" + n + "]");
		}
		System.out.println("[" + ary[0] + "]");
	}
}

/*
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] cmd = sc.nextLine().split("");

		System.out.println("["+Integer.parseInt(cmd[0]) * 10000+"]");
		System.out.println("["+Integer.parseInt(cmd[1]) * 1000+"]");
		System.out.println("["+Integer.parseInt(cmd[2]) * 100+"]");
		System.out.println("["+Integer.parseInt(cmd[3]) * 10+"]");
		System.out.println("["+Integer.parseInt(cmd[4]) * 1+"]");

		sc.close();
	}

}
*/