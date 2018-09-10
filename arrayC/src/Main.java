import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();
        int []a=new int[n];
        int cnt=0;
        for(int i =0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]>0){
                cnt++;
            }
        }
        System.out.print(cnt);

    }
}
