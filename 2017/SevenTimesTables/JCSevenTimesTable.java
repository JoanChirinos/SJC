/*
  My Name
  Year -- Problem
  Date
*/

/*
  A simple concept, takes input from stdin
  stdin = sample.in
*/

import java.util.Scanner;

public class JCSevenTimesTable {

  public static String identify(String[] els) {
    String ret = "";
    for (String i : els) {
      int x = Integer.parseInt(i);
      if (x % 7 == 0) ret += i + " ";
    }
    if (ret.length() > 0) ret = ret.substring(0, ret.length() - 1);
    return ret;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int lines = Integer.parseInt(sc.nextLine());
    for ( ; lines > 0; lines--) {
      System.out.println(identify(sc.nextLine().split(" ")));
    }
  }

}
