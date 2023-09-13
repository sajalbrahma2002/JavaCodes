// Nested Exception - try & catch block
public class Program86 
{
    public static void main(String[] args) 
    {
        try
        {
            try
            {
                System.out.println("Going to divivde");
                int b=39/0;
                System.out.println(b);
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            try
            {
                int a[]=new int[5];
                a[5]=4;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
            System.out.println("Other Statement.");
        }  
        catch(Exception e)  
        {
            System.out.println(e);
        }
    }
}