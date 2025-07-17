public class copy_constructor {
  int a;

  copy_constructor() {
    a = 10;
  }

  copy_constructor(copy_constructor ob3) {
    a = ob3.a;
  }

  void display() {
    System.out.println(a + " ");
  }

  public static void main(String[] args) {
    copy_constructor ob1 = new copy_constructor();
    copy_constructor ob2 = new copy_constructor(ob1);
    ob1.display();
    ob2.display();
  }
}
