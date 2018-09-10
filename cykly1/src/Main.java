import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();

        for(int i=a;i<=b;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
