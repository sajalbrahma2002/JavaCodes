// To perform Body Mass Index of a person through IF - ELSE - IF Statement
import java.util.Scanner;
class Program19
{
    public static void main(String args[]) 
    {
       Scanner obj = new Scanner(System.in);
       System.out.printf("Enter age in years:- ");
       int age = obj.nextInt();
       System.out.print("\nInput weight in kgs :- ");
       double weight = obj.nextDouble();
       System.out.print("\nInput height in meters :- ");
       double height = obj.nextDouble();
       double BMI = weight/(height*height);
       System.out.print("\nThe Body Mass Index is :- "+BMI+" kg/m2");
       if(BMI<16)
       {
        System.out.print("\nSerious Underweight.");
       }
       else if(age>=16 && age<18)
       {
        System.out.print("\nUnderweight.");
       }
       else if(age>=18 && age<24)
       {
        System.out.print("\nNormal Weight.");
       }
       else if(age>=24 && age<=35)
       {
        System.out.print("\nSeriuosly Overweight.");
       }
       else
       {
        System.out.print("\nGravely Overweight.");
       }
       obj.close();
    }
}