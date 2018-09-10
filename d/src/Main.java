import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();

        System.out.print(k-((k/n)*n));
    }
}
