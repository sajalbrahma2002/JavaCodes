// Inheritance
class A
{
    int i=10,j=20;
    void xyz()
    {
        System.out.println(i+j);
    }
    void Imn()
    {
        System.out.println("Imn");
    }
}

class B extends A
{
    int k=40,l=45;
    void abc()
    {
        System.out.println(k+l);
        Imn();
    }
}

class C extends B
{
    void hello()
    {
        xyz();
    }
}

public class Program69 
{
    public static void main(String[] args) 
    {
        C obj=new C();
        obj.xyz();
        obj.abc();
    }
}
