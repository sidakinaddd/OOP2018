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
        for(int i=1;i<n;i++){
            if((a[i]>0 && a[i-1]>0) ||(a[i]<0 && a[i-1]<0) ){
                cnt++;
            }
        }
        if(cnt>0){
            System.out.print("YES");
        }else {
            System.out.print("NO");
        }

    }
}
