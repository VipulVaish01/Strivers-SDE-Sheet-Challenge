package Learn_Basics.Basic_Recursion;

import java.util.Scanner;

public class Print_N_times {

  public static void printNtimes(int n) {
    if (n == 0) {
      return;
    }

    printNtimes(n - 1);
    System.out.println(n);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    printNtimes(n);
  }
}
