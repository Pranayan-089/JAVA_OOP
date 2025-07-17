public class constructor_overloading {
  int a, b;

  constructor_overloading() {
    System.out.println("its constructor overloading");
  }

  constructor_overloading(int x, int y) {
    a = x;
    b = y;
    System.out.println(a + " " + b);
  }

  public static void main(String[] args) {
    constructor_overloading ob = new constructor_overloading(2, 3);
    constructor_overloading ob1 = new constructor_overloading();
  }
}
