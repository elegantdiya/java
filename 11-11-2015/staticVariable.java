class staticVariable{
  static int a;

  public static void main(String[] args) {
    staticVariable obj = new staticVariable();
    obj.a = 5;
    staticVariable obj1 = new staticVariable();
    obj1.a = 6;

    System.out.println(obj.a);
    System.out.println(obj1.a);

  }
}
