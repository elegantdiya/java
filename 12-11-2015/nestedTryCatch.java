class nestedTryCatch{
  public static void main(String[] args) {
    try {
      try {
        int a[] = new int[3];
        a[5] = 5;
      } catch (ArithmeticException e) {
        System.out.println("Cannot Divide by zero");
      }
    }catch (Exception e) {
      System.out.println("There was an error");
    }
  }
}
