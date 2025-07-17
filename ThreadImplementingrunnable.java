class t1 implements Runnable {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("t1's i=" + i);
    }
  }
}

class t2 implements Runnable {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("t2's i=" + i);
    }
  }
}

public class ThreadImplementingrunnable {
  public static void main(String[] args) {
    t1 ob1 = new t1();
    Thread ob = new Thread(ob1);
    ob.start();
    t2 ob2 = new t2();
    Thread ob3 = new Thread(ob2);
    ob3.start();

    for (int i = 0; i < 10; i++) {
      System.out.println("Main Thread's i=" + i);
    }
  }
}
