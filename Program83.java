// Exception Handling Example - 1
public class Program83 
{
    public static void main(String[] args)
    {
        try
        {
            int[] myNum={1,2,3};
            System.out.println(myNum[5]);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong.");
        }
    }   
}