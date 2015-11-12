class finallyKeyword{
  public static void main(String[] args) {
    final int a;
    try {
      try{
        a = 4;
        a = a / 0;
      } finally {
        System.out.println("I am always going to be executed");
      }
    } catch (Exception e) {

    }

  }
}
