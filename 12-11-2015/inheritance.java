class parent{
  int a;
  String b;
}

class inheritance extends parent{
  public static void main(String[] args) {
    inheritance obj = new inheritance();
    obj.a = 56;
    obj.b = "Pamela";

    System.out.println(obj.b);
  }
}
