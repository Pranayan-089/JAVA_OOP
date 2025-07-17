abstract class P {
  int a = 10;
  int b = 20;

  void display() {
    System.out.println(a);
  }

  abstract void display1();
}

class D extends P {
  void display1() {
    System.out.println(b);
  }
}

public class abstractClass {
  public static void main(String[] args) {
    D ob = new D();
    ob.display();
    ob.display1();
  }
}
