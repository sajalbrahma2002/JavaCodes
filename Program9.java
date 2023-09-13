// To perform Operator Precedence Example 2      
public class Program9
{
   public static void main(String args[]) 
   {
      int a=10;
      int b=10;
      System.out.println(a++ + ++b); // prints 10+11=21
      System.out.println(b++ + b++); // prints 11+12=23
   }
}