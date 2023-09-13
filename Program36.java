// To check if the number is Armstrong Number
import java.util.Scanner;
public class Program36 
{
    public static void main(String[] args) 
    {
        int rem=0,sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter number to check for Armstrong :- ");
        int num=obj.nextInt();
        for(int i=num;i!=0;i=i/10)
        {
            rem=i%10;
            sum=sum+(rem*rem*rem);
        }
        if(sum==num)
        System.out.println("Armstrong Number.");
        else
        System.out.println("Not an Armstrong Number.");    
        obj.close();
    }   
}