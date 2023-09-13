// LMS Assessment - Inheritance
import java.util.Scanner;

class UGStudents
{
    String name,degree,branch,S_name;
    double gpa,percentage;
    int sem;
    void display1()
    {
        System.out.println("\n\nUG Student Information :- ");
        System.out.print("\nStudent name :- "+name);
        System.out.print("\nStudent degree :- "+degree);
        System.out.print("\nStudent Branch :- "+branch);
        System.out.print("\nStudent GPA :- "+gpa);
        System.out.print("\nStudent Semster :- "+sem);
        System.out.print("\nStudent School Name :- "+S_name);
        System.out.print("\nStudent Percentage :- "+percentage);
    }
}

class MasterPrg extends UGStudents
{
    String B_degree,C_name;
    double cgpa1;
    void display2()
    {
        display1();
        System.out.println("\n\nMaster Programme Information :- ");
        System.out.print("\nBasic Degree :- "+B_degree);
        System.out.print("\nStudent College Name :- "+C_name);
        System.out.print("\nStudent cgpa :- "+cgpa1);
    }
}

class Phd extends MasterPrg
{
    String M_degree,C_Name,spec,supervisor;
    double cgpa2;
    void display3()
    {
        display2();
        System.out.println("\n\nPHD Information :- ");
        System.out.print("\nMaster Degree :- "+M_degree);
        System.out.print("\nStudent College Name :- "+C_Name);
        System.out.print("\nStudent cgpa :- "+cgpa2);   
    }
}
public class Program72 
{
    public static void main(String[] args) 
    {
        Phd obj=new Phd();
        Scanner sc1=new Scanner(System.in);
        System.out.println("\nUG Student Information :- ");
        System.out.print("\nEnter Student name :- ");
        obj.name=sc1.next();
        System.out.print("Enter Student degree :- ");
        obj.degree=sc1.next();
        System.out.print("Enter Student Branch :-");
        obj.branch=sc1.next();
        System.out.print("Enter Student GPA :- ");
        obj.gpa=sc1.nextDouble();
        System.out.print("Enter Student Semster :- ");
        obj.sem=sc1.nextInt();
        System.out.print("Enter Student School Name :- ");
        obj.S_name=sc1.next();
        System.out.print("Enter Student Percentage :- ");
        obj.percentage=sc1.nextDouble();
        System.out.println("\nMaster Programme Information :- ");
        System.out.print("\nEnter Basic Degree :- ");
        obj.B_degree=sc1.next();
        System.out.print("Enter Student College Name :- ");
        obj.C_name=sc1.next();
        System.out.print("Enter Student cgpa :- ");
        obj.cgpa1=sc1.nextDouble();
        System.out.println("\nPHD Information :- ");
        System.out.print("\nEnter Master Degree :- ");
        obj.M_degree=sc1.next();
        System.out.print("Enter Student College Name :- ");
        obj.C_Name=sc1.next();
        System.out.print("Enter Student cgpa :- ");
        obj.cgpa2=sc1.nextDouble();
        obj.display3();    
        sc1.close();   
    }  
}