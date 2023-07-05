import java.util.Scanner;

public class Pallindrome {

  public static int reverseNum(int n){
    int rev = 0;

    while (n > 0) {
      int rem = n % 10;
      n /= 10;
      rev = rev*10 + rem; 
    }

    return rev;
  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int reverse = reverseNum(n);
    if(reverse == n) {
       System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
