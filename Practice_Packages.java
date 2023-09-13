package myCustomer;
import myBank.*;

import java.util.*;
import java.io.*;

class Customer extends Bank
{
   int acc_no,Cust_id;
   String Cust_name,acc_type;
   int cur_acc_bal,min_bal=1000;
   int acc_dept,acc_with;
   Scanner sc=new Scanner(System.in);
   public void cust_details()
   {
      System.out.print("Enter Customer Id :- ");
      Cust_id=sc.nextInt();
      System.out.print("Enter Account Number :- ");
      acc_no=sc.nextInt();
      System.out.print("Enter Customer Name :- ");
      Cust_name=sc.next();
      System.out.print("Enter Account Type :- ");
      acc_type=sc.next();
      System.out.print("Enter Customer Account Balance :- ");
      cur_acc_bal=sc.nextInt();
   }
   public void Deposits(int ac_dep)
   {
      acc_dept=ac_dep;
      cur_acc_bal=cur_acc_bal+acc_dept;
      System.out.println("Current balance after deposits :- "+cur_acc_bal);
   }
   public void Withdrawn(int ac_wd)
   {
      acc_with=ac_wd;
      if(cur_acc_bal-acc_with>=min_bal)
      {
         cur_acc_bal=cur_acc_bal-acc_with;
         System.out.println("Current balance after withdrawn :- "+cur_acc_bal);
      }
      else
      {
         System.out.println("Withdrawn not possible.");
      }
    }

    public void display_Cust_details()
    {
       System.out.println("Customer Name :- "+Cust_name);
       System.out.println("Customer Id :- "+Cust_id);
       System.out.println("Account Number :- "+acc_no);
       System.out.println("Account Type :- "+acc_type);
       System.out.println("Current Account Balance :- "+cur_acc_bal);
    }
}

class Practice_Packages
{
   public static void main(String[] args)
   {
      Scanner x=new Scanner(System.in);
      Customer obj=new Customer();
      obj.Bankdetails();
      obj.cust_details();
      System.out.print("\nEnter amount to be deposited :- ");
      int dept=x.nextInt();
      obj.Deposits(dept);
      System.out.print("\nEnter amount to be deposited :- ");
      int wdn=x.nextInt();
      obj.Withdrawn(wdn);
      obj.display_Bank_details();
      obj.display_Cust_details();
    }
}

  
      
      