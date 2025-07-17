class A {
  int a = 10;
  int b = 20;
}

class B extends A {
  void display() {
    System.out.println(a);
    System.out.println(b);
  }
}

class C extends B {
  void display1() {
    System.out.println(a);
  }
}

public class multiLevelInheritance {
  public static void main(String[] args) {
    C ob = new C();
    ob.display();
    ob.display1();
  }
}
