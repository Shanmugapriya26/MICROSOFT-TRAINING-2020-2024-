import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		int ans = 0,mean=0;
		for(int i=0;i<array.length;i++){
		    array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length;i++){
		    ans+=array[i];
		    mean = ans/size;
		}
		System.out.println(mean);
	}
}
