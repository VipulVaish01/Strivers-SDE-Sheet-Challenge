import java.util.Scanner;

public class Print_ALL_Divisor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for( int i=1; i*i <= n; i++){
      if(n%i == 0){
        System.out.print(i + " ");
        if(n/i != i){
          System.out.println(n/i);
        }
      }
    }
  }
}
