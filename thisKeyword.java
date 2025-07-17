public class thisKeyword {
  int a;
  int b;

  thisKeyword(int a, int b) {
    this.a = a;
    this.b = b;
  }

  void display() {
    System.out.println(a + " " + b);
  }

  public static void main(String[] args) {
    thisKeyword ob = new thisKeyword(30, 50);
    ob.display();
  }
}
