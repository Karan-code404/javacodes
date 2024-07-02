public class Factorial {

  public static int factorial(int n) {
    int result = 1;
    if (n < 0) { // Handle negative numbers (optional)
      throw new IllegalArgumentException("Factorial is not defined for negative numbers");
    }

    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }

  public static void main(String[] args) {
    int number = 5;
    int result = factorial(number);
    System.out.println("Factorial of " + number + " is " + result);
  }
}
