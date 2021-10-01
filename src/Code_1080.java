import java.util.Scanner;

public class Code_1080 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int i = 1, sum = 0;
		
		while(true) {
			sum+=i;
			if (sum>=x)
				break;
			i++;
		}
		System.out.println(i);
	}
}
