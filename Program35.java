// To perform For Each Loop Example 2 to find Sum of elements in the array
public class Program35 
{
    public static void main(String[] args) 
    {
        int arr[]={12,13,14,44};
        int total=0;
        for(int i:arr)
        total=total+i;
        System.out.print("Sum :- "+total);       
    }   
}