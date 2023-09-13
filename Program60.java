// To perform NCR Permutation & Combination
import java.util.Scanner;

class Combination
{
    int num,ratio;
    int Calculate(int n)
    {
        if(n>1)
        {
            return n*Calculate(n-1);
        }
        else
        {
            return 1;
        }
    }
}

public class Program60
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter value of n :- ");
        int n=obj.nextInt();
        System.out.print("\nEnter value of r :- ");
        int r=obj.nextInt();
        Combination temp=new Combination();
        int x=temp.Calculate(n);
        int y=temp.Calculate(n-r)*temp.Calculate(r);
        int z=x/y;
        System.out.println("The Combination of the Eqaution is :- "+z);
        obj.close();
    }
}