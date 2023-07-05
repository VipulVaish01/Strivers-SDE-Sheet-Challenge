import java.util.Scanner;

public class CheckPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=2; i*i <= n; i++){
      if(n%i == 0){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes Prime");
  }
}
