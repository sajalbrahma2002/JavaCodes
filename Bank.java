package myBank;
import java.util.*;

public class Bank
{
   int Bank_id;
   String Bank_name,Branch_name;
   Scanner sc=new Scanner(System.in);
   public void Bankdetails()
   {
       System.out.print("Enter Bank Id :- ");
       Bank_id=sc.nextInt();
       System.out.print("Enter Bank Name :- ");
       Bank_name=sc.next();
       System.out.print("Enter Branch Name :- ");
       Branch_name=sc.next();
   }
   public void display_Bank_details()
   {
       System.out.println("Bank Id :- "+Bank_id);
       System.out.println("Bank Name :- "+Bank_name);
       System.out.println("Branch Name :- "+Branch_name);
   }
}
       