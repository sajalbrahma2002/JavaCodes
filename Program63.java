// Constructor Overloading
class Constructor_Over
{
    double width;
    double height;
    double depth;
    Constructor_Over(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    Constructor_Over()
    {
        width=-1;
        height=-1;
        depth=-1;
    }
    Constructor_Over(double len)
    {
        width=height=depth=len;
    }
    double Volume()
    {
        return width*height*depth;
    }
}
public class Program63 
{
    public static void main(String[] args) 
    {
        Constructor_Over obj1=new Constructor_Over();
        double x1=obj1.Volume();
        System.out.println("The Volume is :- "+x1);
        Constructor_Over obj2=new Constructor_Over(5.0,6.0,7.0);
        double x2=obj2.Volume();
        System.out.println("The Volume is :- "+x2);
        Constructor_Over obj3=new Constructor_Over(5.6);
        double x3=obj3.Volume();
        System.out.println("The Volume is :- "+x3);
    }
}