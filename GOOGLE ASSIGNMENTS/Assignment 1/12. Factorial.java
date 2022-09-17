import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		int factorial = 1;
		for(int i=1;i<=num;i++){
		    factorial*=i;
		}
		System.out.print(factorial);
	}
}
