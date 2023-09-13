// Interfaces Abstract classes And Inheritance
import java.util.Scanner;

interface Student1
{
    public void getregno1(int num1);
    public void getregno2(int num2);
}

interface Student2 extends Student1
{
    public void printregno();
}

abstract class Proctee
{
    abstract void getname(String name1,String name2);
}
class Details extends Proctee implements Student2
{
    int reg1,reg2;
    String name1,name2;
    public void getregno1(int num1)
    {
        reg1=num1;
    }
    public void getregno2(int num2)
    {
        reg2=num2;
    }
    void getname(String name1,String name2)
    {
        this.name1=name1;
        this.name2=name2;
    }
    public void printregno()
    {
        System.out.println("Name :-"+name1+"  Reg No :- "+reg1);
        System.out.println("Name :-"+name2+"  Reg No :- "+reg2);
    }
}
public class Program79 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name of Student 1 :- ");
        String word1=sc.next();
        System.out.print("Enter regno of Student 1 :- ");
        int n1=sc.nextInt();
        System.out.print("Enter name of Student 2 :- ");
        String word2=sc.next();
        System.out.print("Enter regno of Student 2 :- ");
        int n2=sc.nextInt();
        Details obj=new Details();
        obj.getname(word1,word2);
        obj.getregno1(n1);
        obj.getregno2(n2);
        obj.printregno();
        sc.close();  
    }   
}