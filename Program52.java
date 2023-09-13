// To count the number of words , consonent and vowels in a string
import java.util.Scanner; 
public class Program52 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int vowel=0,consonent=0;
        System.out.print("Enter the string :- ");
        String str=obj.nextLine();
        int len=str.length();
        System.out.println("Total words in the string :- "+len);
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'|| str.charAt(i)=='A'|| str.charAt(i)=='E'|| str.charAt(i)=='I'|| str.charAt(i)=='O'|| str.charAt(i)=='U')
            {
                vowel++;
            }
        }
        consonent=len-vowel;
        System.out.println("Total Consonents :- "+consonent);
        System.out.println("Total Vowels :- "+vowel);
        obj.close();
    }   
}