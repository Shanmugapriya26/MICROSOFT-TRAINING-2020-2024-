import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int min,gcd=0;
    if(n1<n2){
      min=n1;
    }
    else{
      min=n2;
    }
    for(int i=1;i<=min;i++){
      if(n1%i==0 && n2%i==0){
        gcd=i;
      }
    }
    int lcm = (n1*n2)/gcd;
    System.out.println(lcm);
  }
}
