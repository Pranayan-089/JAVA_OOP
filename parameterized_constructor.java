public class parameterized_constructor {
  int a = 0;
  int b = 0;

  parameterized_constructor(int x, int y) {
    a = x;
    b = y;
  }

  public void display() {
    System.out.println(a + " " + b);
  }

  public static void main(String[] args) {
    parameterized_constructor ob2 = new parameterized_constructor(10, 20);
    ob2.display();
  }
}
