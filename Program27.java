// To find the Sum of the odd numbers between 3 and 300 using while loop operation
public class Program27
{
    public static void main(String[] args)
    {
        int i=3;
        int sum=0;
        while(i<=300)
        {
            sum=sum+i;     
            i=i+2;
        }
        System.out.print("Sum :- "+sum);
    }
}