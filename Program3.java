// To perform Bitwise OR Operation
import java.util.*;
class Program3
{
    public static void main(String[] args) 
    {
       Scanner obj = new Scanner(System.in);
       int num1,num2,result;
       num1=obj.nextInt();
       num2=obj.nextInt();
       result=num1 | num2;
       System.out.println("Bitwise OR Operation :- "+result);
       obj.close();
    }
}