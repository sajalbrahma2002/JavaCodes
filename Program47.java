// To have more than 1 function inside class to find the Minimum in the Array
public class Program47 
{
    static void min(int arr[])
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i])
            min=arr[i];
        }
        System.out.println("Minimum Element in the Array :- "+min);
    }
    public static void main(String[] args) 
    {
        int array[]={33,4,3,5};
        min(array);   
    }   
}