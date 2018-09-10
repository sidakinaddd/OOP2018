import java.util.Scanner;

public class Main {

    public static int  funcmmin(int a, int b) {
        if(a>b){
            return b;
        }else return a;
    }

    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            int d=s.nextInt();

            System.out.print(funcmmin(funcmmin(a,b),funcmmin(c,d)));
    }
}
