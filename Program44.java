// Practice ArrayExceptionOutofBound Condition
public class Program44 
{
    public static void main(String[] args)
    {
        int array[]={50,60,70,80};
        for(int i=0;i<=array.length;i++)  // Use < instead of <=
        System.out.print(array[i]+" ");
    }   
}