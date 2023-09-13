// To perform Operator Precedence Example 3       
public class Program10 
{
   public static void main(String args[]) 
   {
      int a=10;
      int b=10;
      System.out.println(++a + ++b); // prints 11+11=22
      System.out.println(b-- + b++); // prints 11+10=21 then b=11 
   }
}