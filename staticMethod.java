class test {
  static void display() {
    System.out.println("It can be called without creating object");
  }

  void display1() {
    System.out.println("cant be called");
  }
}

public class staticMethod {
  public static void main(String[] args) {
    test.display();
    test ob = new test();
    ob.display1();
  }
}
