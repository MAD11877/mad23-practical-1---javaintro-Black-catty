import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    int base= in.nextInt();      
    //inner loop  
    for (int i= base-1; i>=0 ; i--)  
    {  
    //outer loop  
      for (int j=0; j<=i; j++)  
      {  
      //prints star and space  
      System.out.print("*" + " ");  
      }  
    //throws the cursor in the next line after printing each line  
    System.out.println();  
    }  
    }  
} 
    
                      

