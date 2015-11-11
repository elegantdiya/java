class bankObject{
  String name;
  int phoneno;
  int accno;
  int bankbalance;
  void set(String a, int b,int c,int d){
    this.name = a;
    this.phoneno = b;
    this.accno = c;
    this.bankbalance = d;
  }
  void display(){
    System.out.println("Name = " + name);
    System.out.println("Phone no. = " + phoneno);
    System.out.println("Acc no. = " + accno);
    System.out.println("Bank balance = " + bankbalance);
  }
  public static void main(String[] args) {
    bankObject Bob = new bankObject();
    Bob.set("Bob",7122,3455,500000);
    Bob.display();
    bankObject Marley = new bankObject();
    Marley.set("Marley",6706,8798,600000);
    Marley.display();

  }
}
