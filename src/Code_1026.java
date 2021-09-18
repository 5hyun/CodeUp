	import java.util.Scanner;


public class Code_1026 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String x = sc.next();
        String[] ary = x.split("\\:");
        int num = Integer.parseInt(ary[1]);
        
        if(num<10)
            System.out.printf("%1d", num);
        else
            System.out.printf("%d", num);
	}
}
