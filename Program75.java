// Super Keyword to call variables/methods of Base class in Inheritance
class Base2
{
    int i;
}

class Subclass extends Base2
{
    int i;
    Subclass(int a,int b)
    {
        super.i=a;
        i=b;
    }
    void show()
    {
        System.out.println("i in Superclass is :- "+super.i);
        System.out.println("i in Subclass is :- "+i);
    }
}
public class Program75 
{
    public static void main(String[] args)
    {
        Subclass obj=new Subclass(1,2);
        obj.show();
    }
    
}
