import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for(int i =0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
