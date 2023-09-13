// To perform Operator Precedence Example 1       
public class Program8 
{
   public static void main(String args[]) 
   {
      int x=10;
      System.out.println(x++); // prints 10 first and then gets incremented to 11 (post increment)
      System.out.println(++x); // gets incremented to 12 first then gets printed 12(pre increment) 
      System.out.println(x--); // prints 12 first and then gets decremented to 11 (post decrement)
      System.out.println(--x); // gets decremented to 10 first then gets printed 10(pre increment)
    }    
}