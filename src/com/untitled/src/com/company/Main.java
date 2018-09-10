
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int number =s.nextInt();

        System.out.println("The next number for the number "+number+" is "+(number+1));
        System.out.println(" the previous number for the number "+number+" is "+(number-1));

    }
}
