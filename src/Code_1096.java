import java.util.Scanner;

public class Code_1096 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ary[][] = new int[19][19];
		
		for(int i=0;i<19;i++) {
			for(int j=0;j<19;j++) {
				ary[i][j]=0;
			}
		}
		
		int x = sc.nextInt();
		
		for(int i=0;i<x;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			ary[a-1][b-1] = 1;
		}
		
		for(int i=0;i<19;i++) {
			for(int j=0;j<19;j++) {
				System.out.print(ary[i][j]+" ");
			}
			System.out.printf("\n");
		}
	}
}
