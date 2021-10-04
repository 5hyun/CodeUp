import java.util.Scanner;

public class Code_1097 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ary[][]=new int[19][19];
		
		for(int i=0;i<19;i++) {
			for(int j=0;j<19;j++) {
				int x = sc.nextInt();
				ary[i][j]=x;
			}
		}
		
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--; b--;
			
			for(int j =0; j<19;j++) {
				if (ary[a][j]==0)
					ary[a][j]=1;
				else
					ary[a][j]=0;
				if (ary[j][b]==0)
					ary[j][b]=1;
				else
					ary[j][b]=0;
			}
		}
		
		for(int i=0;i<19;i++) {
			for(int j=0;j<19;j++) {
				System.out.printf("%d ", ary[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
