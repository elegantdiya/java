class medicineClass{
  String name;
  double paracetemol;
  double calpol;
  double gelusil;
  double carbozyme;

  medicineClass(){

  }

  medicineClass(medicineClass shop){
    this.name = shop.name;
    this.paracetemol = shop.paracetemol + 2;
    this.calpol = shop.calpol;
    this.gelusil = shop.gelusil + 2;
    this.carbozyme = shop.carbozyme;
  }

  medicineClass(String a,double b,double c,double d,double e){
    this.name = a;
    this.paracetemol = b;
    this.calpol = c;
    this.gelusil = d;
    this.carbozyme = e;
  }
  void display(){
    System.out.println("Name = " + name);
    System.out.println("Price of Paracetemol = " + paracetemol);
    System.out.println("Price of Calpol = " + calpol);
    System.out.println("Price of Gelusil = " + gelusil);
    System.out.println("Price of Carbozyme = " + carbozyme);
  }
  public static void main(String[] args){
    medicineClass Frankross = new medicineClass("Frankross Pharmacy",5,6,8,9);
    medicineClass Apollo = new medicineClass("Apollo Pharmacy",6,7,8,9);
    Frankross.display();
    Apollo.display();

    //Separete Frnakross Branch
    medicineClass Frankross2 = new medicineClass(Frankross);
    Frankross2.display();

  }
}
