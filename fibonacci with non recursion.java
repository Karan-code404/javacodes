import java.util.Scanner;
public class SixthLab{
    public static void finfnthFibonacciNumberBYNonRecursiveMethod(int n)
    {
        //0 1 1 2 3
        int first=0;
        int second=1;
        int third=0;
        System.out.print(first+"\n"+second+"\n");
        if(n<=1)
        {
            System.out.println("Fibonacci Number at nth Position: "+n);
        }
        for(int i=2;i<=n;i++)
        {
            third=first+second;
            first=second;
            second=third;
            
            System.out.println(third+" ");
        }
        System.out.println("Last Nth term value is"+third);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("THE FIBONACCI SERIES IS: ");
        finfnthFibonacciNumberBYNonRecursiveMethod(n);
}
}
