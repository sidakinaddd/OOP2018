import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();
        int e=s.nextInt();
        int cnt=0;
        for(int x=0;x<=1000;x++){
            if(a*x*x*x+b*x*x+c*x+d==x-e){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
