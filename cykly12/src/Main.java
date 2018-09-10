import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int k=1;
        int ss=s.nextInt();

        for(int i=1;k<=ss;i++){
            for(int j=1;j<=i && k<=ss;j++){
                System.out.print(i+" ");
                k++;
            }
        }

    }
}
