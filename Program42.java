// To perform Array operations
import java.util.Scanner;
public class Program42 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int array[]=new int[5];
        System.out.print("Enter the array elements :- ");
        for(int i=0;i<5;i++)
        array[i]=obj.nextInt();
        for(int i=0;i<5;i++)
        System.out.print(array[i]+" ");
        obj.close();
    }
}