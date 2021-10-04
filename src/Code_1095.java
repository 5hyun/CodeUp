import java.util.Scanner;

public class Code_1095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int ary[] = new int[n];
		
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			ary[i]=x;
		}
		
		int res = ary[0];
		for(int i=1;i<n;i++) 
			if(res>ary[i]) 
				res=ary[i];
		System.out.println(res);
	}
}
