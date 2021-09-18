import java.util.Scanner;

public class Code_1027 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String x = sc.next();
        String[] ary = x.split("\\.");
        
        int a = Integer.parseInt(ary[0]);
        int b = Integer.parseInt(ary[1]);
        int c = Integer.parseInt(ary[2]);

        System.out.printf("%d-%02d-%2d", c, b, a);
    }
}
