import java.util.Scanner;

public class Code_1078 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i <= x; i++) {
			if(i%2==0)
				sum+=i;
		}
		
		System.out.println(sum);
	}
}
