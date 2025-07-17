import java.io.IOException;

public class Finally {
  public static void main(String[] args) throws IOException {
    int a = 10;
    int b = 0;
    try {
      int c = a / b;
    } catch (ArithmeticException e) {
      System.out.println("division by zero results by infinity");
    } finally {
      System.out.println("It will always execute");
    }
  }
}
