import java.util.Scanner;

class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the vlaue of n: ");
        int n=sc.nextInt();
        int first=0;
        int second=1;
        System.out.print(first+" "+ second+" ");
        for(int i=2;i<=n;i++){
        int next=first+second;
        first=second;
        second=next;
        System.out.print(next+" ");
        }
        System.out.println("fibonaci series is" +second);
    }
}
