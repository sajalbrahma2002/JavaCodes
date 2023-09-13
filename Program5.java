// To perform Bitwise Left Shift Operation
import java.util.*;
class Program5
{
    public static void main(String[] args) 
    {
       Scanner obj = new Scanner(System.in);
       int num,result;
       num=obj.nextInt();
       result=num << 2;
       System.out.println("Bitwise Left Shift Operation :- "+result);
       obj.close();
    }
}