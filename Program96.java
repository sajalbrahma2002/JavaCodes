// MAT 2 - Reverse String 
import java.util.*;

public class Program96 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String :- ");
        String line=sc.next();
        int len=line.length();
        char arr[]=new char[len];
        int j=len-1;
        for(int i=0;i<len;i++)
        {
            arr[i]=line.charAt(j);
            j--;
        }
        System.out.print("The Reverse String is :- ");
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]);
        }
        sc.close();
    }   
}