// PAT 5 - Interfaces & Inheritance
import java.util.*;
import java.lang.String;

interface Details
{
    public void totals(int a,int b,int c);
    public void average(int a,int b,int c);
    public void details(int r,String n,String d,String s);
}

class Calculate implements Details
{
    int roll,mark1,mark2,mark3,total,avg;
    String name,dept,sem;
    public void totals(int a,int b,int c)
    {
        mark1=a;
        mark2=b;
        mark3=c;
        total=mark1+mark2+mark3;
    }
    public void average(int a,int b,int c)
    {
        mark1=a;
        mark2=b;
        mark3=c;
        avg=(mark1+mark2+mark3)/3;
    }

    public void details(int r,String n,String d,String s)
    {
        roll=r;
        name=n;
        dept=d;
        sem=s;
    }

    public void display()
    {
        System.out.println("Roll no :- "+roll);
        System.out.println("Name :- "+name);
        System.out.println("Department :- "+dept);
        System.out.println("Semester :- "+sem);
        System.out.println("Marks in Subject 1 :- "+mark1);
        System.out.println("Marks in Subject 2 :- "+mark2);
        System.out.println("Marks in Subject 3 :- "+mark3);
        System.out.println("Total Marks Scored :- "+total);
        System.out.println("Average Marks Scored :- "+avg);
        if(avg>=95)
        System.out.println("Grade :- S");
        else
        if(avg>=90 && avg<=94)
        System.out.println("Grade :- A");
        else
        System.out.println("Grade :- Invalid");
    }
}

public class Program92
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of students details you want to enter :- ");
        int num=sc.nextInt();
        Calculate obj[]=new Calculate[num];
        for(int i=0;i<num;i++)
        {
            obj[i]=new Calculate();
            System.out.print("Enter Roll Number :- ");
            int ro=sc.nextInt();
            System.out.print("Enter Name :- ");
            String na=sc.next();
            System.out.print("Enter Department :- ");
            String de=sc.next();
            System.out.print("Enter Semester :- ");
            String se=sc.next();
            System.out.print("Enter Marks in Subject 1 :- ");
            int m1=sc.nextInt();
            System.out.print("Enter Marks in Subject 2 :- ");
            int m2=sc.nextInt();
            System.out.print("Enter Marks in Subject 3 :- ");
            int m3=sc.nextInt();
            obj[i].details(ro,na,de,se);
            obj[i].totals(m1,m2,m3);
            obj[i].average(m1,m2,m3);
        }
        for(int i=0;i<num;i++)
        {
            System.out.println("Details of Student "+(i+1));
            obj[i].display();
        }
        sc.close();
    }
}