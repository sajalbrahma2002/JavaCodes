// To perform Constructor Invokation in Class
class Constructor
{
    double width;
    double height;
    double depth;
    Constructor()
    {
        System.out.println("Constructing Constructor Class");
        width=10;
        height=10;
        depth=10;
    }
    double Volume()
    {
        return width*height*depth;
    }
}

class Program62
{
    public static void main(String[] args)
    {
        Constructor obj=new Constructor();
        double x=obj.Volume();
        System.out.println("The Volume is :- "+x);
    }
}