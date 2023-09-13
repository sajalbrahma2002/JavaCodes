// IPS Exercise - Word Verififcation

import java.util.Scanner;

class Program78
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int flag=0;
        System.out.print("Enter the word :- ");
        String word=obj.next();
        int len=word.length();
        String temp=word.toLowerCase();
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(temp.charAt(i)==temp.charAt(j))
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)
        System.out.println("Good Word.");
        else
        System.out.println("Bad Word.");
        obj.close();
    }
}