import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int minn=300000;
        for(int i=2;i<=a;i++){
            if(a%i==0 && i<minn){
                minn=i;
            }
        }
        System.out.print(minn);

    }
}
