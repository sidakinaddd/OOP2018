import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int j=0;

        for(int i=a;i<=b;i++){
            j=(int)Math.sqrt(i);
            if(i==j*j){
                System.out.print(i+" ");
            }
        }
    }
}
