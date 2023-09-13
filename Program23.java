// To perform Switch case operation Example 1
import java.util.Scanner;
class Program23
{
    public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter your number :- ");
       int num=obj.nextInt();
       switch(num)
       {
        case 0: System.out.println("Number is 0.");
                break;
        case 1: System.out.println("Number is 1.");
                break;
        default: System.out.println("Number is "+num);
       }  
       obj.close();
    } 
}