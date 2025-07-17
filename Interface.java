interface inter {
  int a = 10;
  
  void display();

}

class impl implements inter {
  public void display() {
    System.out.println(a);
  }
}

public class Interface {
  public static void main(String args[]) {
    impl ob = new impl();
    ob.display();
  }
}
