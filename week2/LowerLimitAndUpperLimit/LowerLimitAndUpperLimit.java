
/**
 *
 * @author www.github.com/cruzken
 */
 
 import java.util.Scanner;
  
 public class LowerLimitAndUpperLimit {
  
     public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
  
         // write your code here
         System.out.println("First: ");
         int lower = Integer.parseInt(reader.nextLine());
         System.out.println("Last: ");
         int upper = Integer.parseInt(reader.nextLine());
          
         while (lower <= upper) {
             System.out.println(lower);
             lower++;
         }
     }
 }
 