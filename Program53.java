// PAT 1 - To perform Right Shift in an array
import java.util.Scanner;

public class Program53 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int temp;
        System.out.print("Enter the number of elements to input in the array :- ");
        int num=obj.nextInt();
        int array[]=new int[num];
        for(int i=0;i<num;i++)
        {
            array[i]=obj.nextInt();
        }
        System.out.print("\nEnter the number to perform right shift operation :- ");
        int shift=obj.nextInt();
        while(shift>0)
        {
            temp=array[num-1];
            int x=num-1;
            while(x>0)
            {
                array[x]=array[x-1];
                x--;
            }
            array[x]=temp;
            shift--;
        }
        System.out.print("\nArray after Right Shift Operation :- ");
        for(int i=0;i<num;i++)
        System.out.print(array[i]+" ");
        obj.close();
    }   
}