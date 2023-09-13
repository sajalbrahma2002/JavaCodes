// IPS2 - To display the Negative numbers in the entered range
import java.util.Scanner;
public class Program49 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter starting of the range :- ");
        int start=obj.nextInt();
        System.out.print("\nEnter starting of the range :- ");
        int end=obj.nextInt();
        int i=start;
        System.out.print("\n");
        while(i<0 && i<end)
        {
            System.out.print(i+" ");
            i++;
        }
        obj.close();
    } 
}