// To display the Positive numbers in the entered range
import java.util.Scanner;
public class Program50 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter starting of the range :- ");
        int start=obj.nextInt();
        System.out.print("\nEnter starting of the range :- ");
        int end=obj.nextInt();
        System.out.print("\n");
        for(int i=start;i<=end;i++)
        {
            if(i>0)
            System.out.print(i+" ");
        }
        obj.close();
    } 
}