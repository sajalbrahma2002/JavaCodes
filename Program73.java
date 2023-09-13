// Multiple Inheritance
class Base1
{
    int a=2,b=3,c;
    void add()
    {
        c=a+b;
        System.out.println("Sum is :- "+c);
    }
}

class Derive_1 extends Base1
{
    int f=5,d=3,e;
    void sub()
    {
        e=f-d;
        System.out.println("Difference is :- "+e);
    }
} 

class Derive_2 extends Derive_1
{
    int k=5,j=10,m;
    void mul()
    {
        m=k*j;
        System.out.println("Product is :- "+m);
    }
}

class Program73
{
    public static void main(String[] args)
    {
        Derive_2 obj=new Derive_2();
        obj.add();
        obj.sub();
        obj.mul();
    }
}