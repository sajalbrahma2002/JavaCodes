// Exception Handling - finally Keyword 
public class Program90 
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
        finally
        {
            System.out.println("Statement is placed with finally block ");
        }
    }
}