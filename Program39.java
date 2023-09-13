// To print the Prime numbers between a range
import java.util.Scanner;

public class Program39 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the starting of the range :- ");
        int start=obj.nextInt();
        System.out.print("Enter the ending of the range :- ");
        int end=obj.nextInt();
        for(int i=start;i<=end;i++)
        {
            int temp=0;
            for(int j=2;j<=(i/2);j++)
            {
                if(i%j==0)
                temp=1;
            }
            if(temp==0)
            System.out.print(i+" ");
        }
        obj.close();  
    }    
}