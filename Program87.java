// Exception Handling - throw Keyword (Bank Number)
import java.util.Scanner;

public class Program87 
{
    static void CheckNumber(int len)
    {
        if(len==10)
        System.out.println("Valid Bank Number.");
        else
        throw new ArithmeticException("Invalid Input");
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Bank Number :- ");
        String num=sc.next();
        int length=num.length();
        CheckNumber(length);
        sc.close();   
    } 
}