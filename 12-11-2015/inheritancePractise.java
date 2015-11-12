class Mammals{
  String a = "Mammals";
  void howIreproduce(){
    System.out.println("I have SEX");
  }
}

class Cats{
  String b = "Cats";
  int c = 12;
}

class Dogs extends Mammals{
  String b = "Dogs";
  int c = 34;
}

class inheritancePractise{
  public static void main(String[] args) {
    Cats pussy = new Cats();
    System.out.println(pussy.a + pussy.b + pussy.c);
    pussy.howIreproduce();
    Dogs pomi = new Dogs();
    System.out.println(pomi.a + pomi.b + pomi.c);
  }
}
