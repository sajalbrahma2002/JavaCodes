// To perform Function Overloading (Compile Time Polymorphism)
class Overloading
{
    void test()
    {
        System.out.print("No Parameters.");
    }
    void test(int a)
    {
        System.out.print("\na is :- "+a);
    }
    void test(int a,int b)
    {
        System.out.print("\na and b is :- "+a+" , "+b);
    }
    double test(double a)
    {
        System.out.print("\nDouble a is :- "+a);
        return a*a;
    }
}

public class Program61 
{
    public static void main(String[] args) 
    {
        Overloading obj=new Overloading();
        obj.test();
        obj.test(2);
        obj.test(3,4);
        obj.test(2.0); 
    }
}
