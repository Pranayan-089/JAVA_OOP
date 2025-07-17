public class try_catch {
  public static void main(String[] args) {
    int a = 12, b = 0;
    try {
      int c = a / b;
    } catch (ArithmeticException e) {
      System.out.println("division by zero results in infinity");
    }
    
    
  }
}
