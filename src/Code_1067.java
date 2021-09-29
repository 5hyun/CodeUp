import java.util.Scanner;

public class Code_1067 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		
		if (x<0) 
			System.out.println("minus");
		else
			System.out.println("plus");
		
		if(x%2==0)
			System.out.println("even");
		else
			System.out.println("odd");

	}
}
