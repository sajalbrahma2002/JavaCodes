// To perform if the entered number is a Palindrome
import java.util.Scanner;
public class Program24 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Number :- ");
        int num=obj.nextInt();
        int rem=0,rev=0,temp=0;
        temp=num;
        while(num!=0)
        {
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        if(temp==rev)
        {
            System.out.println("Palindrome.");
        } 
        else
        {
            System.out.println("Not Palindrome.");
        }    
        obj.close();   
    }   
}