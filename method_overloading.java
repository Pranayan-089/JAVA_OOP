public class method_overloading {
  public void sum(int a, int b) {
    int c = a + b;
    System.out.println(c);
  }

  public void sum(int a, int b, int c) {
    int d = a + b + c;
    System.out.println(d);
  }

  public void sum(double a, double b) {
    double c = a + b;
    System.out.println(c);
  }

  public static void main(String[] args) {
    method_overloading ob = new method_overloading();
    ob.sum(1, 2);
    ob.sum(2.7, 8.7);
    ob.sum(12, 034, 88);

  }
}
