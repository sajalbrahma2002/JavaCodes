package Employee;
import java.util.*;

public class emp
{
   int Emp_id;
   String Emp_name,Emp_desg;
   Scanner sc=new Scanner(System.in);
   public void get_data()
   {
       System.out.print("\nEnter employee id :- ");
       Emp_id=sc.nextInt();
       System.out.print("\nEnter employee name :- ");
       Emp_name=sc.next();
       System.out.print("\nEnter employee designation :- ");
       Emp_desg=sc.next();
   }
   public void display_Emp_details()
   {
       System.out.println("Employee id :- "+Emp_id);
       System.out.println("Employee name :- "+Emp_name);
       System.out.println("Employee designation :- "+Emp_desg);
   }
}