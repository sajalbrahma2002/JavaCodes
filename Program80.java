// PAT 4 - Recurve Function to print Fabonacci Series
import java.util.Scanner;

class Fabonacci
{
    int a=0,b=1,c;
    public void Calculate(int n)
    {
        if(n>0)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            n=n-1;
            Calculate(n);
        }
    }
}

class Program80
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int num=sc.nextInt();
        Fabonacci obj=new Fabonacci();
        System.out.print("0 1");
        obj.Calculate(num-2);
        sc.close();
    }
}