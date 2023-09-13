// MAT 1 - Print the details of the book/CDs
import java.util.*;

class Detail 
{
    int ISBN,year,page,time,cost;
    String author,title;
    void getdata(int num,String aut,String ti,int ye,int ch,int x)
    {
        ISBN=num;
        author=aut;
        title=ti;
        year=ye;
        if(ch==0)
        {
            page=x;
        }
        if(ch==1)
        {
            time=x;
        }
    }

    void Calculate_Cost(int ch)
    {
        if(ch==0)
        {
            cost=page;
        }
        if(ch==1)
        {
            cost=time*2;
        }
    }

    void Display_details()
    {
        System.out.println("ISBN :- "+ISBN);
        System.out.println("Author :- "+author);
        System.out.println("Title :- "+title);
        System.out.println("Year of Publication :- "+year);
        System.out.println("Cost :- "+cost);
    }
}

class Program95
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your choice (0 for books & 1 for recorded CD/DVD):- ");
        int choice=sc.nextInt();
        Detail obj=new Detail();
        System.out.print("Enter ISBN :- ");
        int a=sc.nextInt();
        System.out.print("Enter Author Name :- ");
        String b=sc.next();
        System.out.print("Enter Title Name :- ");
        String c=sc.next();
        System.out.print("Enter Year of Publication :- ");
        int d=sc.nextInt();
        if(choice==0)
        {
            System.out.print("Enter no of pages :- ");
            int e=sc.nextInt();
            obj.getdata(a,b,c,d,choice,e);
        }
        if(choice==1)
        {
            System.out.print("Enter total time in minutes :- ");
            int e=sc.nextInt();
            obj.getdata(a,b,c,d,choice,e);
        }
        obj.Calculate_Cost(choice);
        obj.Display_details();
        sc.close();
    }
}