class constructors{
  int a;
  int b;

  constructors(){
    System.out.println("I am in a constructor");
  }

  constructors(int a){
    System.out.println("I am a parameterized constructor : " + a);
  }

  constructors(double a){
    System.out.println("I am a parameterized constructor with double: " + a);
  }

  constructors(int a, int b){
    this.a = a;
    this.b = b;
  }

  void display(){
    System.out.println("A: " + a);
    System.out.println("B: " + b);
  }

  public static void main(String[] args) {
      //constructors obj = new constructors();
      constructors obj2 = new constructors(23, 56);
      obj2.display();

      constructors obj1 = new constructors(12, 5);
      obj1.display();
  }
}
