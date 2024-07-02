import java.util.Scanner;
public class Calculator {

    public void addition(int a, int b) {
        System.out.println("Sum is: " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction is: " + (a - b));
    }

    public void div(int a, int b) {
            System.out.println("Division is: " + (a / b));
    }

    public void multiply(int a, int b) {
        System.out.println("Multiplication is: " + (a * b));
    }

    public void modulos(int a, int b) {
        System.out.println("Modulus is: " + (a % b));
    }
    public void bitwiseAnd(int a, int b) {
        System.out.println("Bitwise AND result: " + (a & b));
    }
    public void bitwiseOr(int a, int b) {
        System.out.println("Bitwise OR result: " + (a | b));
    }
    public void bitwiseXor(int a, int b) {
        System.out.println("Bitwise XOR result: " + (a ^ b));
    }
    public void bitwiseNot(int a,int b) {
        System.out.println("Bitwise NOT result for " + a + ": " + (~a));
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner=new Scanner(System.in);
        calculator.addition(10, 5);
        calculator.sub(10, 5);
        System.out.println("enter the value of a and b: ");
        calculator.multiply(scanner.nextInt(),scanner.nextInt());
        calculator.modulos(10, 5);
        calculator.bitwiseAnd(5,6);
        calculator.bitwiseOr(10, 5);
        calculator.bitwiseXor(5,6);
        calculator.bitwiseNot(10, 5);
    }
}
