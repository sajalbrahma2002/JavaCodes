// To perform class other than main function class
import java.util.Scanner;

class Addition
{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    void add()
    {
        int c=a+b;
        System.out.println("The sum is :- "+c);
    }
}

public class Program54 
{
    public static void main(String[] args)
    {
        Addition obj=new Addition();
        obj.add();
    }    
}