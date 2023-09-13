// Super Keyword to call Constructor of Base class in Inheritance
class Box
{
    private double height;
    private double weight;
    private double depth;
    Box(Box ob)
    {
        height=ob.height;
        weight=ob.weight;
        depth=ob.depth;
    }
    Box(double h,double w,double d)
    {
        height=h;
        weight=w;
        depth=d;
    }
    double Volume()
    {
        return height*weight*depth;
    }
}

class Boxweight extends Box
{
    Boxweight(Box ob)
    {
        super(ob);
    }
}

public class Program74 
{
    public static void main(String[] args)
    {
        Box MyBox1=new Box(10,20,15);
        Boxweight MyClone=new Boxweight(MyBox1);
        double x=MyClone.Volume();
        System.out.println("Volumr is :- "+x);
    } 
}