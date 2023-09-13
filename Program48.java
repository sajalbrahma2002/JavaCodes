// IPS1 - To find the pth digit in the number is odd or even
import java.util.Scanner;
public class Program48 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number :- ");
        long num=obj.nextLong();
        System.out.print("\nEnter the Position :- ");
        int p=obj.nextInt();
        long temp1=num;
        long temp2=num;
        int count=0;
        long rem=0;
        while(temp1!=0)
        {
            temp1=temp1/10;
            count++;
        }
        long array[]=new long[count]; 
        while(temp2!=0 && count>=0)
        {
            rem=temp2%10;
            array[count-1]=rem;
            temp2=temp2/10;
            count--;
        }
        if(array[p-1]%2==0)
        System.out.println("Number in the entered position is Even. "+array[p-1]);
        else
        System.out.println("Number in the entered position is Odd. "+array[p-1]);
        obj.close();
    }    
}