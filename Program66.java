// This Keyboard
class This
{
    int rollno;
    String name;
    float fee;
    This(int rollno,String name,float fee)
    {
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display()
    {
        System.out.println(rollno+"  "+name+"  "+fee);
    }
}
public class Program66 
{
    public static void main(String[] args)
    {
        
    This obj1=new This(111,"Ankit",5000f);
    This obj2=new This(112,"Sumit",6000f);
    obj1.display();
    obj2.display();
    } 
}