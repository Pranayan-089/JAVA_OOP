class A {
  int a = 10;
}

class B extends A {
  int a = 20;

  void display() {
    System.out.println(a);
    System.out.println(super.a);
  }
}

public class variableOverriding {
  public static void main(String[] args) {
    B ob = new B();
    ob.display();
  }
}
