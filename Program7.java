// To find the Discriminant of the Quadratic Equation
import java.util.*;
class Program7
{
    public static void main(String [] args)
    {
        Scanner obj = new Scanner(System.in);
        int a,b,c,result;
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        result=(b*b)-(4*a*c);
        System.out.println("The Discriminant of the Quadratic Equation is :- "+result); 
        obj.close();
    }
}