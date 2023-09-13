// Exercise 1 - Function Overloading 
class Calculate
{
    double radius;
    void Volume()
    {
        System.out.println("Invoking Void return type class with no parameters.");
        radius=10.0;
        double x=(3.14*radius*radius*radius)/3;
        System.out.println("The Volume of Sphere is :- "+x);
    }
    double Volume(int r)
    {
        System.out.println("Invoking double return type class with int parameters.");
        radius=r;
        double x=(3.14*radius*radius*radius)/3;
        return x;
    }
    double Volume(double r)
    {
        System.out.println("Invoking double return type class with double parameters.");
        radius=10.0;
        double x=(3.14*radius*radius*radius)/3;
        return x;
    }
    double Volume(float r)
    {
        System.out.println("Invoking double return type class with float parameters.");
        radius=r;
        double x=(3.14*radius*radius*radius)/3;
        return x;
    }
}
public class Program67 
{
    public static void main(String[] args)
    {
        Calculate obj1=new Calculate();
        obj1.Volume();
        double y1=obj1.Volume(10);
        System.out.println("\nThe Volume of Sphere is :- "+y1);
        double y2=obj1.Volume(10.0);
        System.out.println("\nThe Volume of Sphere is :- "+y2);
        double y3=obj1.Volume(10f);
        System.out.println("\nThe Volume of Sphere is :- "+y3);
    }
}