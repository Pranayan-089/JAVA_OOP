class userExe extends Exception {
  userExe(String str) {
    System.out.println(str);
  }
}

public class userDefinedexception {

  public static void main(String[] args) {
    String str = "pranayan";
    if (str.charAt(0) == 'a' || str.charAt(0) == 'A') {
      System.out.println("valid");
    } else {
      try {
        throw new userExe("invalid");
      } catch (userExe e) {

      }

    }
  }
}
