/*
  Joan Chirinos
  2017 -- SecondsToGo
  05-05-18
*/

/*
  Simple concept, but keep the stdin in mind
*/

import java.util.Scanner;

public class JCSecondsToGo {


  public static int compute(int hours, int minutes) {
    return hours * 3600 + minutes * 60;
  }

  //uses scanner and System.in to read from stdin
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int h = s.nextInt();
    int m = s.nextInt();
    System.out.println(compute(h, m) + " seconds to go");
  }

}
