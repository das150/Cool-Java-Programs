import java.util.Scanner;

public class SearchNumbers {
    public static void main(String args[]) {
      System.out.println("Enter the number that you want to find:  ");
      
      Scanner keyIn = new Scanner(System.in);
      double input = keyIn.nextDouble();
      
      int[] numList = {0,10,12,4,3,2,4};
      
      System.out.println("Searching...");
      int index = 0;
      boolean found = false;
      for (int number : numList) {
         if (number == input) {
            System.out.println("Number found at index " + index);
            found = true;
         }
         index++;
      }
      
      if(!found) {
         System.out.println("Number not found!");
      }

    }
}
