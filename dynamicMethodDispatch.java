class parent {
  int q = 10;

  void display() {
    System.out.println(q);
  }
}

class child extends parent {
  int z = 20;

  void display() {
    System.out.println(z);
  }
}

class child1 extends parent {
  int y = 90;

  void display() {
    System.out.println(y);
  }
}

public class dynamicMethodDispatch {
  public static void main(String[] args) {
    parent p;
    child ob = new child();
    child1 ob1 = new child1();

    p = ob1;
    p.display();
    p = ob;
    p.display();
  }
}
