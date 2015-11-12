class multipleCatch{
  public static void main(String[] args) {
    int a = 45;
    int array[] = new int[2];
    try {
      //a = a / 0;
      System.out.println(array[5]);
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Out of Bounds");
    }
  }
}
