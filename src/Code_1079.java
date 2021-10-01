import java.util.Scanner;

public class Code_1079 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			char x = sc.nextLine().charAt(0);
			
			if(x=='q') {
				System.out.println(x);
				break;
			}
			System.out.println(x);
		} 
		
	}
}
