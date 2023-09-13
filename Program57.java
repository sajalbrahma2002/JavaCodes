// Function with return type & no argument
class Box2
{
    double height,width,depth;
    double Volume()
    {
        height=10.1;
        width=12.2;
        depth=5.6;
        double ans=height*width*depth;
        return ans;
    }
}
public class Program57 
{
    public static void main(String[] args) 
    {
        Box2 obj=new Box2();
        double x=obj.Volume();  
        System.out.println("The Volume of the cuboid is :- "+x);
    }   
}