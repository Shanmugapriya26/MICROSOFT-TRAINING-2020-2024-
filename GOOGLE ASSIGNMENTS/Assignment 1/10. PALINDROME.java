import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String k = "";
		for(int i=s.length()-1;i>=0;i--){
		    k += s.charAt(i);
		}
		if(k.equals(s)){
		    System.out.println("palindrome");
		}
		else{
		    System.out.println(" not palindrome");
		}
	}
}
