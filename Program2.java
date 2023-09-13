// To perform Bitwise AND Operation
import java.util.*;
class Program2
{
    public static void main(String[] args) 
    {
       Scanner obj = new Scanner(System.in);
       int num1,num2,result;
       num1=obj.nextInt();
       num2=obj.nextInt();
       result=num1 & num2;
       System.out.println("Bitwise And Operation :- "+result);
       obj.close();
    }
}