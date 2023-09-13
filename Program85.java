// File Handling - Multiple Catch blocks
public class Program85 
{
    public static void main(String[] args) 
    {
        try
        {
            int a[]=new int[5];
            a[4]=3;
            a[4]=30/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception Caught.");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out Of Exception Caught.");
        }
        catch(Exception e)
        {
            System.out.println("Default Exception");
        }
        System.out.println("Rest of the code..");
    }
}