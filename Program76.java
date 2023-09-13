// PAT 3 - Method Overloading inside a class
import java.util.Scanner;

class Area
{
    double base;
    double height1;
    double top;
    double bottom;
    double height2;
    double radius;
    void ComputeArea(double b1,double h1)
    {
        base=b1;
        height1=h1;
        double A=base*height1;
        System.out.printf("\nThe Area of Rectangle is :- %.2f",A);
    }
    void ComputeArea(double t,double b2,double h2)
    {
        top=t;
        bottom=b2;
        height2=h2;
        double B=height2*(top+bottom)/2;
        System.out.printf("\nThe Area of Trapezium is :- %.2f",B);
    }

    void ComputeArea(double r)
    {
        radius=r;
        double C=3.14*radius*radius;
        System.out.printf("\nThe Area of Circle is :-  %.2f",C);
    }
}

class Program76
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base of Rectangle :- ");
        double num1=sc.nextDouble();
        System.out.print("Enter the height of Rectangle :- ");
        double num2=sc.nextDouble();
        System.out.print("Enter the top of Trapezium :- ");
        double num3=sc.nextDouble();
        System.out.print("Enter the top of Trapezium :- ");
        double num4=sc.nextDouble();
        System.out.print("Enter the height of Trapezium :- ");
        double num5=sc.nextDouble();
        System.out.print("Enter the radius of Circle :- ");
        double num6=sc.nextDouble();
        Area obj=new Area();
        obj.ComputeArea(num1,num2);
        obj.ComputeArea(num3,num4,num5);
        obj.ComputeArea(num6);
        sc.close();
    }
}