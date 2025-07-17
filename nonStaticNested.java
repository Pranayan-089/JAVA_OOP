public class nonStaticNested {
  int a = 10;
  static int b = 20;

  void display() {
    inner ob = new inner();
    ob.display1();
  }

  class inner {
    int c = 30;

    void display1() {
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
    }
  }

  public static void main(String[] args) {
    nonStaticNested ob1 = new nonStaticNested();
    ob1.display();
  }
}
