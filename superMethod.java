class A {
  int a = 10;

  A() {
    System.out.println(a);
  }
}

class B extends A {
  int b = 20;

  B() {
    super();
    System.out.println(b);
  }
}

public class superMethod {
  public static void main(String[] args) {
    B ob = new B();
  }
}
