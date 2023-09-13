// To perform IF - ELSE Statement to find number is odd or even
import java.util.Scanner;
class Program17
{
    public static void main(String args[]) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.printf("Enter number :- ");
        int num=obj.nextInt();
        if(num%2==0)
        {
            System.out.print("\nEven number.");
        }
        else
        {
            System.out.print("\nOdd number.");
        }
        obj.close();
    }
}