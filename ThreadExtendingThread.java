class threadeg extends Thread {
  threadeg() {
    start();
  }

  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Thread1's i=" + i);
    }
  }
}

class threadeg2 extends Thread {
  threadeg2() {
    start();
  }

  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Thread2's i=" + i);
    }
  }
}

public class ThreadExtendingThread {
  public static void main(String[] args) {
    new threadeg();
    new threadeg2();
    for (int i = 0; i < 10; i++) {
      System.out.println("Main thread's i=" + i);
    }
  }
}
