package Department;
import Employee.*;
import java.util.*;

class details 
{
   int dept_id,total_emp;
   String dept_name;
   Scanner sc=new Scanner(System.in);
   void dept_get_data()
   {
      System.out.print("\nEnter Departmant Id :- ");
      dept_id=sc.nextInt();
      System.out.print("\nEnter Departmant Name :- ");
      dept_name=sc.next();
      System.out.print("\nEnter No of Employees :- ");
      total_emp=sc.nextInt();
   }
   void display_Dept_details()
   {
      System.out.println("Department Id :- "+dept_id);
      System.out.println("Departmant name :- "+dept_name);
      System.out.println("No of employees :- "+total_emp);
   }
}

class depart
{
   public static void main(String[] args)
   {
      emp obj1=new emp();
      details obj2=new details();
      obj1.get_data(); 
      obj2.dept_get_data();
      obj1.display_Emp_details();
      obj2.display_Dept_details();
   }
}
