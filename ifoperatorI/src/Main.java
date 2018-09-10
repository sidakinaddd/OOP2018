import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();
        if((Math.abs(a-c)==0 || Math.abs(a-c)==1)||((Math.abs(b-d)==0) || Math.abs(b-d)==1)){
            System.out.print("YES");
        }else System.out.print("NO");
    }
}
