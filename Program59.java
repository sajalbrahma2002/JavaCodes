// Function with return type & argument
class Box4
{
    double height,width,depth;
    double Volume(double h,double w,double d)
    {
        height=h;
        width=w;
        depth=d;
        double ans=height*width*depth;
        return ans;
    }
}

public class Program59 
{
    public static void main(String[] args) 
    {
        Box4 obj=new Box4();
        double x=obj.Volume(10.1,12.2,5.6);  
        System.out.println("The Volume of the cuboid is :- "+x);
    }   
}