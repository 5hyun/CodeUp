import java.util.Scanner;

public class Code_1087 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int sum=0;
		
		for(int i = 1; i<=x; i++) {
			sum+=i;
			if(sum>=x)
				break;
		}
		System.out.println(sum);
	}
}
