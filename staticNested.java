public class staticNested {
  int a = 10;
  static int b = 20;

  void display() {
    inner ob = new inner();
    ob.display1();
  }

  static class inner {
    int c = 30;

    void display1() {
      staticNested ob1 = new staticNested();
      System.out.println(c);
      System.out.println(b);
      System.out.println(ob1.a);
    }
  }

  public static void main(String[] args) {
    staticNested ob2 = new staticNested();
    ob2.display();
  }
}