// Inheritance with same function name in different classes
class First
{
    void func1(int x)
    {
        System.out.println("int in class A is :- "+x);
    }
}

class Second extends First
{
    void func1(int x)
    {
        System.out.println("int in class B is :- "+x);
    }
}

public class Program71 
{
    public static void main(String[] args) 
    {
        First obj1=new First();
        obj1.func1(2);
        Second obj2=new Second();
        obj2.func1(3);   
    }   
}