import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int cnt=0;

        for(int i=1;i<=a;i++){
            if(a%i==0){
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}
