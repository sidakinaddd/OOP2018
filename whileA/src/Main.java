import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here\
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for(int i =1;i<=n;i++){
            if(i*i<=n){
                System.out.print(i*i+" ");
            }
        }
    }
}
