// To perform String class Functions by checking your name is Palindrome with your friend
import java.util.Scanner;

public class Program51 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int temp=0,i,j;
        System.out.print("Enter your name :- ");
        String name1=obj.nextLine();
        System.out.print("\nEnter your name :- ");
        String name2=obj.nextLine();
        int len1=name1.length();
        int len2=name2.length();
        if(len1==len2)
        {
            i=0;
            j=len2-1;
            while(i<len1 && j>=0)
            {
                if(name1.charAt(i)!=name2.charAt(j))
                {
                    temp=1;
                }
                i++;
                j--;
            }
            if(temp==0)
            System.out.println("Palindrome.");
            else
            System.out.println("Not Palindrome.");
        }
        else
        System.out.println("Not Palindrome.");
        obj.close();
    }    
}