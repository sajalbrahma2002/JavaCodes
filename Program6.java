// To perform Bitwise Right Shift Operation
import java.util.*;
class Program6
{
    public static void main(String[] args) 
    {
       Scanner obj = new Scanner(System.in);
       int num,result;
       num=obj.nextInt();
       result=num >> 2;
       System.out.println("Bitwise Right Shift Operation :- "+result);
       obj.close();
    }
}