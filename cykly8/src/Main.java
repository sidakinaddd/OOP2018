import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            int b=s.nextInt();
            sum+=b;
        }
        System.out.print(sum);
    }
}
