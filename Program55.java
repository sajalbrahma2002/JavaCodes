// PAT 2 - Password Checker
import java.util.Scanner;

public class Program55 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int digit=0;
        int letter=0;
        int special=0;
        System.out.print("Enter the Password :- ");
        String arr=obj.nextLine();
        int len=arr.length();
        if(len==8)
        {
            if((arr.charAt(0)>='A') && (arr.charAt(0)<='Z')||(arr.charAt(0)>='a') && (arr.charAt(0)<='z'))
            {
                for(int i=0;i<len;i++)
                {
                    if((arr.charAt(i)>='A') && (arr.charAt(i)<='Z')||(arr.charAt(i)>='a') && (arr.charAt(i)<='z'))
                    {
                        letter++;
                    }
                    else
                        if((arr.charAt(i)>='0') && (arr.charAt(i)<='9'))
                        {
                            digit++;
                        }
                        else
                        {
                            special++;
                        }
                }
                if(digit>0 && special>0 && letter>0)
                {
                    System.out.println("Valid Password.");
                }
                else
                {
                    System.out.println("Invalid Password.");
                }
            }
            else
            {
                System.out.println("Invalid Password.");
            }
        }
        else
        {
            System.out.println("Invalid Password.");
        } 
        obj.close();   
    }
}