import java.util.Scanner;

public class Code_1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int ary[] = new int[n];
		int count=0;
		
		while(true) {
			int x = sc.nextInt();
			ary[count]=x;
			count++;
			if(count==n)
				break;
		}
		
		for(int i=n-1;i>=0;i--) {
			System.out.printf("%d ", ary[i]);
		}
	}
}
