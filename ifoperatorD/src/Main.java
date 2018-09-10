import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>0){
            System.out.print(1);
        }else if(a<0){
            System.out.print(-1);
        }else {
            System.out.print(0);
        }
    }
}
