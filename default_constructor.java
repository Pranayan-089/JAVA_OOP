public class default_constructor {
  int a, b;

  default_constructor() {
    a = 10;
    b = 20;
  }

  public void display() {
    System.out.println(a + " " + b);
  }

  public static void main(String[] args) {
    default_constructor ob1 = new default_constructor();
    ob1.display();
  }
}
