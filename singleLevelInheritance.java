class C extends singleLevelInheritance {
  void display1() {
    System.out.println(a + " ");
  }
}

class singleLevelInheritance {
  int a = 10;
  int b = 20;

  void display() {
    System.out.println(a + " " + b);
  }

  public static void main(String[] args) {
    C ob = new C();
    ob.display();
    ob.display1();
  }

}
