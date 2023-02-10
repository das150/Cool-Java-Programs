import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String args[]) {
    
    double topsqrt = 0;
    double root1 = 0;
    double root2 = 0;
    double a = 0;
    double b = 0;
    double c = 0;
    double icoff = 0;
    
    Scanner keyIn = new Scanner(System.in);  
    
    System.out.print("Enter value of a: ");  
      a = keyIn.nextDouble();  
      
    System.out.print("Enter value of b: ");  
      b = keyIn.nextDouble();
        
    System.out.print("Enter value of c: ");  
      c = keyIn.nextDouble(); 
       
   topsqrt = Math.pow(b, 2) - (4 * a * c);  

   if (topsqrt > 0) {  
      root1 = (-b + Math.pow(topsqrt, 0.5)) / (2 * a);  
      root2 = (-b - Math.pow(topsqrt, 0.5)) / (2 * a);  
      System.out.println("Answers:" + root1 + " and " + root2);
   } else if (topsqrt < 0) {  
      System.out.println("No real roots.");
      root1 = (-b) / (2 * a);
      
      icoff = (Math.sqrt(Math.abs(topsqrt))) / (2 * a);
      System.out.println(root1 + " plus or minus " + icoff + "i");
         
   } else {
      root1 = (-b + Math.pow(topsqrt, 0.5)) / (2 * a);  
      System.out.println("Answer: " + root1); 
   }    
           
      
    }
}
