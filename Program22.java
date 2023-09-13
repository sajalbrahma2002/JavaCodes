// To perform NESTED IF Conditional Statement
import java.util.Scanner;
class Program22
{
    public static void main(String args[]) 
    {
       Scanner obj =new Scanner(System.in);
       System.out.print("Enter 1st number :- "); 
       int num1=obj.nextInt();
       System.out.print("Enter 2nd number :- "); 
       int num2=obj.nextInt();
       System.out.print("Enter 3rd number :- "); 
       int num3=obj.nextInt();
       if(num1>=num2)
       {
          if(num1>=num3)
          {
            System.out.println("\nNumber 1 is largest.");
          }
          else
          {
            System.out.println("\nNumber 3 is largest.");
          }
       }
       else if(num2>=num3)
            {
              System.out.println("\nNumber 2 is largest.");
            }
            else
            {
              System.out.println("\nNumber 3 is largest.");
            }
       obj.close();
    }
}