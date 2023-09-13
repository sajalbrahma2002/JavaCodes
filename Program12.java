// To perform Operator Precedence Example 5
class Program12
{
    public static void main(String args[])
    {
        int result=0;
        result=5+2*3-1;
        System.out.println("5+2*3-1 :- "+result); // prints 10
        result=5+4/2+6;
        System.out.println("5+4/2+6 :- "+result); // prints 13
        result=3+6/2*3-1+2;
        System.out.println("3+6/2*3-1+2 :- "+result); // prints 13
        result=6/2*3*2/3;
        System.out.println("6/2*3*2/3 :- "+result); // prints 6
    }
}