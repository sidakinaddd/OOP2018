import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();

        if(a>b){
            System.out.print(1);
        }else if(a<b){
            System.out.print(2);
        }else {
            System.out.print(0);
        }
    }
}
