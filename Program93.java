// PAT 6 - Abstract Class & Overriding of Function 
import java.util.*;

abstract class SHAPE
{
    abstract void display_area();
}

class Square extends SHAPE
{
    int side;
    public void get_data(int s)
    {
        side=s;
    }
    void display_area()
    {
        System.out.println("Area of Sqaure :- "+(side*side));
    }
}

class Triangle extends SHAPE
{
    int height,base;
    public void get_data(int h,int b)
    {
        height=h;
        base=b;
    }
    void display_area()
    {
        int area=(height*base)/2;
        System.out.println("Area of Triangle :- "+area);
    }
}

class Rectangle extends SHAPE
{
    int length,breadth;
    public void get_data(int l,int b)
    {
        length=l;
        breadth=b;
    }
    void display_area()
    {
        System.out.println("Area of Rectangle :- "+(length*breadth));
    }
}

class Circle extends SHAPE
{
    int radius;
    public void get_data(int r)
    {
        radius=r;
    }
    void display_area()
    {
        System.out.println("Area of Circle :- "+(3.14*radius*radius));
    }
}

class Ellipse extends SHAPE
{
    int x_rad,y_rad;
    public void get_data(int x,int y)
    {
        x_rad=x;
        y_rad=y;
    }
    void display_area()
    {
        System.out.println("Area of Ellipse :- "+(3.14*x_rad*y_rad));
    }
}

public class Program93
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your choice to find the area : - \n1. Reactangle \n2. Square \n3. Triangle \n4. Circle \n5. Ellipse");
        System.out.print("\nEnter your choice :- ");
        int num=sc.nextInt();
        if(num==1)
        {
            Rectangle obj=new Rectangle();
            System.out.print("Enter Length of Rectangle :- ");
            int len=sc.nextInt();
            System.out.print("Enter Breadth of Rectangle :- ");
            int bred=sc.nextInt();
            obj.get_data(len,bred);
            obj.display_area();
        }
        else if(num==2)
        {
            Square obj=new Square();
            System.out.print("Enter Side of Sqaure :- ");
            int a=sc.nextInt();
            obj.get_data(a);
            obj.display_area();
        }
        else if(num==3)
        {
            Triangle obj=new Triangle();
            System.out.print("Enter Height of Triangle :- ");
            int hgt=sc.nextInt();
            System.out.print("Enter Base of Triangle :- ");
            int bse=sc.nextInt();
            obj.get_data(hgt,bse);
            obj.display_area();
        }
        else if(num==4)
        {
            Circle obj=new Circle();
            System.out.print("Enter Radius of Circle :- ");
            int r=sc.nextInt();
            obj.get_data(r);
            obj.display_area();
        }
        else if(num==5)
        {
            Ellipse obj=new Ellipse();
            System.out.print("Enter x Radius of Ellipse :- ");
            int r1=sc.nextInt();
            System.out.print("Enter y Radius of Ellipse :- ");
            int r2=sc.nextInt();
            obj.get_data(r1,r2);
            obj.display_area();
        }
        else 
        {
            System.out.println("Invalid Choice.");
        }
        sc.close();
    }
}