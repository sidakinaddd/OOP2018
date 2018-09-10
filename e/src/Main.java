import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=109;
        int v=s.nextInt();
        int t=s.nextInt();

        int ss=v*t;

        if (v > 0) {
            System.out.print(ss%a);
        }else if(ss==0){
            System.out.print(0);
        }else if(v<0){
            System.out.print((a-((-1)*ss%a)));
        }
    }
}
