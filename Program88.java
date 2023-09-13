// Exception Handling - throw Keyword 
public class Program88 
{
    static void validate(int age)
    {
        if(age<18)
        throw new ArithmeticException("Not Valid");
        else
        System.out.println("Welcome to Vote");
    }
    public static void main(String[] args) 
    {
        validate(13);
        System.out.println("Rest of the code ");  
    }
}