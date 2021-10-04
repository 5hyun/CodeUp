import java.util.Scanner;

public class Code_1092 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int res = (a>b?b:a)>c?c:(a>b?b:a);
		int n=res;
		
		while(true) {
			res +=n;
			if((res%a==0)&&(res%b==0)&&(res%c==0))
				break;
		}
		System.out.println(res);
	}
}
