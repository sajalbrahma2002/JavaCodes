// To find Sum & Double of the elements in the Array
public class Program46 
{
    public static void main(String[] args) 
    {
        int[] array={2,-9,0,5,12,-25,22,9,8,12};
        int sum=0;
        Double average=0.0;
        for(int i :array)
        sum=sum+i;
        int len=array.length; 
        average=((double)sum/(double)len);
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+average);
    }
}