// To check if the entered year is a Leap year
import java.util.Scanner;
public class Program37 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Number to check for year :- ");
        int year=obj.nextInt();
        if(year%4==0)
        System.out.println("It is a Leap Year.");
        else
        System.out.println("It is not a Leap Year.");    
        obj.close();
    }    
}