import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("What character do you want to load into the cannon?");
    Scanner inputcharObj = new Scanner(System.in);
    String inputchar = inputcharObj.nextLine();
    System.out.println("Enter the amount of times you want " + "'" + inputchar + "'" + " to be fired from the cannon:");
    System.out.println("Remember that your input mustn't include characters other than numbers.");
    Scanner inputnumtimesObj = new Scanner(System.in);
    boolean inputgoodornot = false;
    String inputnumtimes = "";
    while (inputgoodornot == false) {
      inputnumtimes = inputnumtimesObj.nextLine();
      int inputlength = inputnumtimes.length();
      int keeptrack = 0;
      inputgoodornot = true;
      while (keeptrack < inputlength) {
        if (inputnumtimes.charAt(keeptrack) >= '0' && inputnumtimes.charAt(keeptrack) <= '9') {
          keeptrack = keeptrack + 1;
        }
        else {
          inputgoodornot = false;
          System.out.println("Error: User input must not include characters other than numbers. Try again?");
          break;
        }
      }
    }
    long numoftimes = Long.parseLong(inputnumtimes);
    inputchar = inputchar + " ";
    for (int i = 0; i <= numoftimes; i++) {
      System.out.print(inputchar);
    }
    System.out.println(inputchar + " was printed " + numoftimes + " times");
  }
}