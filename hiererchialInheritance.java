class A {
  int a = 10;
  int b = 20;
}

class B extends A {
  void display() {
    System.out.println(a);
  }
}

class C extends A {
  void display1() {
    System.out.println(b);
  }
}

public class hiererchialInheritance {
  public static void main(String[] args) {
    B ob = new B();
    C ob1 = new C();
    ob.display();
    ob1.display1();
  }
}
