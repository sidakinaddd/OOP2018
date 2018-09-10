import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=100;i++){
            int a=s.nextInt();
            sum+=a;
        }
        System.out.print(sum);
    }
}
