import java.util.Scanner;

public class Palindromes {

    public static void message(int a) {
        if(a==1){
            System.out.println("It is not a palindrome!");
        } else {
            System.out.println("It is a palindrome!");
        }
    }

    public static void main(String args[]) {
    
       System.out.println("Enter a phrase: ");
       Scanner keyIn = new Scanner(System.in);
       String phrase = keyIn.nextLine();
    
       phrase = phrase.toLowerCase().replaceAll(" ", "").replaceAll("'", "");
       
       char[] character = phrase.toCharArray();
    
       int status = 1;
    
    for (int i = 0; i < (phrase.length())/2; i++) {
         if (character[i] == character[phrase.length() - (i + 1)]) {
            status = 0;
         } else {
            status = 1;
            break;
         }
      }
    
    message(status);
          
    }
}
