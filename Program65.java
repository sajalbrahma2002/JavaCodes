// Static Method
class Static2 
{
    int rollno;
    String name;
    static String college="VIT";
    Static2(int r,String n)
    {
        rollno=r;
        name=n;
    }
    static void change()
    {
        college="VIT University";
    }
    void display()
    {
        System.out.println(rollno+"  "+name+"  "+college);
    }
}
public class Program65 
{
    public static void main(String[] args)
    {
        Static2 obj1=new Static2(123,"Ravi");
        Static2 obj2=new Static2(345,"Raju");
        obj1.display();
        Static2.change();
        obj2.display();
    }   
}