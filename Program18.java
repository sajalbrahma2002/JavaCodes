// To perform IF - ELSE Statement to find number is positive or negative
import java.util.Scanner;
class Program18
{
    public static void main(String args[]) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.printf("Enter number :- ");
        int num=obj.nextInt();
        if(num>0)
        {
            System.out.print("\nPositive number.");
        }
        else
        {
            System.out.print("\nNegative number.");
        }
        obj.close();
    }
}