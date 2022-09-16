import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] array = new int[k];
		for(int i=0;i<array.length;i++){
		    array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println(array[array.length-2]);
		
	}
}
