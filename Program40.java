// To perform Taylor Sin Series
import java.util.Scanner;

public class Program40 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter value of x :- ");
        double x=obj.nextDouble();
        System.out.print("\nEnter the limit to which to extend sin series :- ");
        int limit=obj.nextInt();
        double num=x*(3.14/180); // Converting number to radians
        double sum=0.0;
        for(int i=1,j=1;i<=limit;i++,j=j+2)
        {
            if(i%2!=0)     // Add
            {
                double cal1=1.0;
                int z1=j;
                int z2=j;
                while(z1>0)
                {
                    cal1=cal1*num;
                    z1--;
                }
                while(z2>0)
                {
                    cal1=cal1/z2;
                    z2--;
                }
                sum=sum+cal1;
            }
            else           // Subtract
            {      
                double cal2=1.0;
                int z1=j;
                int z2=j;
                while(z1>0)
                {
                    cal2=cal2*num;
                    z1--;
                
                }
                while(z2>0)
                {
                    cal2=cal2/z2;
                    z2--;
                }
                sum=sum-cal2;        
            }
        }
        System.out.println("\nThe sin series sum is :- "+sum);
        obj.close();
    }
}