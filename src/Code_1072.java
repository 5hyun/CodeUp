import java.util.Scanner;

public class Code_1072 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int ary[] = new int [x];
		
		for(int i=0;i<x;i++) {
			int num = sc.nextInt();
			ary[i] = num;
		}
		for(int i=0;i<x;i++) {
			System.out.println(ary[i]);
		}
	}
}
