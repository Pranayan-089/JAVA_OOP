class A {
  int a = 10;

  void display() {
    System.out.println(a);
  }
}

class B extends A {
  int c = 20;

  void display() {
    System.out.println(c);
    super.display();
  }
}

public class MethodOverriding {
  public static void main(String[] args) {
    B ob = new B();
    ob.display();
  }
}
