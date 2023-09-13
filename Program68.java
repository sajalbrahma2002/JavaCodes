// Inheritance
class Base
{
    int a=4,b=5,c;
    void add()
    {
        c=a+b;
        System.out.println("The value of c is :- "+c);
    }
}

class Derive1 extends Base
{
    void sub()
    {
        c=a-b;
        System.out.println("The value of c is :- "+c);
    }
}

class Derive2 extends Derive1
{
    void mul()
    {
        c=a*b;
        System.out.println("The value of c is :- "+c);
    }
}

public class Program68 
{
    public static void main(String[] args) 
    {
        Derive2 obj=new Derive2();
        obj.add();
        obj.sub();
        obj.mul();
    }
}