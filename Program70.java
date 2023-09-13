// Inheritance with same function name in different classes
class One
{
    void func1(int x)
    {
        System.out.println("int in class A is :- "+x);
    }
}

class Two extends One
{
    void func1(int x)
    {
        System.out.println("int in class B is :- "+x);
    }
}

public class Program70 
{
    public static void main(String[] args) 
    {
        One obj;
        obj=new One();
        obj.func1(2);
        obj=new Two();
        obj.func1(3);   
    }   
}