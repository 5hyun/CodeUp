import java.util.Scanner;

public class Code_1098 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		int ary[][]=new int[x][y];
		int l = sc.nextInt();
		
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				ary[i][j]=0;
			}
		}
		
		for(int i =0;i<l;i++) {
			int len = sc.nextInt();
			int rc = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--; b--;
			
			if(rc==0) {
				ary[a][b] = 1;
				for(int s=0;s<len-1;s++) {
					b++;
					ary[a][b]=1;
				}
			}
			else {
				ary[a][b]=1;
				for(int s=0;s<len-1;s++) {
					a++;
					ary[a][b]=1;
				}
			}
		}
		
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				System.out.print(ary[i][j]+" ");
			}
			System.out.printf("\n");
		}
	}
}
