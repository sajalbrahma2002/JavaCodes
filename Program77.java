// Method Overriding in Inheritance of Class
class Rectangle
{
    public void Area(double b)
    {
        double A=b*4;
        System.out.printf("\nThe Area of Rectangle is :- %.2f",A);
    }
}

class Trapezium extends Rectangle
{
    public void Area(double t)
    {
        double B=4*(t+4)/2;
        System.out.printf("\nThe Area of Trapezium is :- %.2f",B);
    }
}

class Circle extends Trapezium
{
    public void Area(double r)
    {
        double C=3.14*r*r;
        System.out.printf("\nThe Area of Circle is :-  %.2f",C);
    }
}

class Program77
{
    public static void main(String[] args)
    {
        Rectangle obj;
        obj=new Rectangle();
        obj.Area(5.0);

        obj=new Trapezium();
        obj.Area(4.0);

        obj=new Circle();
        obj.Area(4.0);
    }
}