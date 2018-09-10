import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int x1=s.nextInt();
        int y1=s.nextInt();
        int x2=s.nextInt();
        int y2=s.nextInt();

        if(((x1+y1)==(x2+y2)) ||((x1-y1)==(x2-y2))){
            System.out.print("YES");
        }else {
            System.out.print("NO");
        }
    }
}
