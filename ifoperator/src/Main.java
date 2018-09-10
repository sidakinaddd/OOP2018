import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();

        if((a==1 && b==1) || (a!=1 && b!=1)){
            System.out.print("YES");
        }else System.out.print("NO");
    }
}
