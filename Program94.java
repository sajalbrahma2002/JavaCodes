// User Defined Exception Handling

class InvalidAgeException extends Exception
{
    InvalidAgeException(String s)
    {
        super(s);
    }
}
public class Program94 
{
    static void validate(int age) throws InvalidAgeException
    {
        if(age<18)
        throw new InvalidAgeException("not valid");
        else
        {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) 
    {
        try
        {
            validate(13);
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured :- "+e);
        }
        System.out.println("Rest of the code.");  
    } 
}