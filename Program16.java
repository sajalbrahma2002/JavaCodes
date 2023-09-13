// To perform Body Mass Index of a person through IF - ELSE Statement
import java.util.Scanner;
class Program16
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
       if(age<16)
       {
        System.out.print("\nAge less than 16.");
       }
       else
       {
        System.out.print("\nThe Body Mass Index is :- "+BMI+" kg/m2");
       }
       obj.close();
    }
}