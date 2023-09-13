// To print the Reverse of the entered number
import java.util.Scanner;
public class Program38 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter number :- ");
        int num=obj.nextInt();
        int rem=0,rev=0;
        while(num!=0)
        {
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        System.out.println("Reverse Number :- "+rev);      
        obj.close();  
    } 
}