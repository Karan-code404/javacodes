import java.util.Scanner;
public class quadraticequation {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("enter tha value of a: ");
         double a=sc.nextDouble();
         System.out.print("enter tha value of b: ");
         double b=sc.nextDouble();
         System.out.print("enter tha value of c: ");
         double c=sc.nextDouble();
         double discriminant=b*b-4*a*c;
         System.out.println("the value of equation is: "+discriminant);
         if(discriminant<0){
             System.out.println("the value is not a real value !");
         }
         else{
             System.out.println("\n\n* the value is a real value *");
         }
    }
}
