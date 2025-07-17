public class throwKeyword {
  public static void main(String[] args) {
    String str = "iryan";
    if (str.charAt(0) == 'a' || str.charAt(0) == 'A') {
      System.out.println("valid");
    } else {
      try {
        throw new ArithmeticException("Invalid");
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}
