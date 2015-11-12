class multipleTryCatch2{
  public static void main(String[] args) {
    try {
      int a = 56;
      a = a/0;
    } catch (ArithmeticException e) {
      System.out.println("Cannot Divide By zero");
    } catch (Exception e) {
      System.out.println("There was an error");
    }
  }
}
