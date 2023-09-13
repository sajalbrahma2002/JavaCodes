import java.io.IOException;

// Exception Handling - throws Keyword 
public class Program89 
{
    void m() throws IOException
    {
        throw new IOException("Device error.");
    }
    void n() throws IOException
    {
        m();
    }
    void p()
    {
        try
        {
            n();
        }
        catch(Exception e)
        {
            System.out.println("Exception handled :- "+e);
        }
    }
    public static void main(String[] args) 
    {
        Program89 obj=new Program89();
        obj.p();
        System.out.println("Normal Flow.");   
    }   
}