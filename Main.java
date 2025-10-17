import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    //Problem 1
    Scanner summing = new Scanner(System.in);
    System.out.println("Please begin typing out numbers, each one will be added up (Use -1 to stop)");
    int lah = summing.nextInt();
    int total = 0;

    while (lah > 1) {
      total += lah;
      lah = summing.nextInt();
    }
    System.out.println("Sum is " + total );
    
    //Problem 2
    Scanner howmany = newScanner(System.in);
    System.out.println("How many numbers would you like to add up in total ")
  }
}
