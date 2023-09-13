// To perform Bitwise XOR Operation
import java.util.*;
class Program4
{
    public static void main(String[] args) 
    {
       Scanner obj = new Scanner(System.in);
       int num1,num2,result;
       num1=obj.nextInt();
       num2=obj.nextInt();
       result=num1 ^ num2;
       System.out.println("Bitwise XOR Operation :- "+result);
       obj.close();
    }
}