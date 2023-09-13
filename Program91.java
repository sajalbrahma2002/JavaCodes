// Exception Handling - without finally 
public class Program91 
{
    public static void main(String[] args)
    {
        try
        {
            int a=args.length;
            int x=5/a;
            System.out.println(x);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Statement is placed without finally block");
    } 
}