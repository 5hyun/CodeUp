import java.util.Scanner;

public class Code_1093 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int ary[] = new int[23];
		int count=0;
		
		for(int i=0;i<23;i++) {
			ary[i]=0;
		}
		
		while(true) {
			int x = sc.nextInt();
			ary[x-1]++;
			count++;
			if(count==n)
				break;
		}
		
		for(int i = 0; i<23;i++) {
			System.out.printf("%d ", ary[i]);
		}
	}
}
