// Static Variables
class Static1
{
    int rollno;
    String name;
    static String college="VIT";
    Static1(int r,String n)
    {
        rollno=r;
        name=n;
    }
    void display()
    {
        System.out.println(rollno+"  "+name+"  "+college);
    }
}

public class Program64 
{
    public static void main(String[] args)
    {
        Static1 obj1=new Static1(123,"Ravi");
        Static1 obj2=new Static1(345,"Raju");
        obj1.display();
        obj2.display();
    }  
}