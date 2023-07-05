import java.util.Scanner;

public class ArmStrong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = n;
    int num = 0;

    while (n > 0) {
      int rem = n % 10;
      n /= 10;
      num = num + rem * rem * rem;
    }

    if (num == x) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}