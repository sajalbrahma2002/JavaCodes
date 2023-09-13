// Abstract Class Example
abstract class Motorbike
{
    abstract void brake();
}

class Sportsbike extends Motorbike
{
    public void brake()
    {
        System.out.println("Sportsbike Brake");
    }
}

class Mountainbike extends Motorbike
{
    public void brake()
    {
        System.out.println("Mountainbike Brake");
    }
}
public class Program82 
{
   public static void main(String[] args) 
   {
        Mountainbike obj1=new Mountainbike();
        obj1.brake();
        Sportsbike obj2=new Sportsbike();
        obj2.brake();
   } 
}