class fundStatic{
  static int fund;
  String name;
  long phoneno;
  String address;

  fundStatic(String a,long b,String c){
    this.name = a;
    this.phoneno = b;
    this.address = c;
  }
  void deposit(int flow){
    fund = fund + flow;
  }
  void withdrawal(int flow){
    if (flow > fund) {
      System.out.println("Not possible");
    } else{
      fund = fund - flow;
    }
  }
  void display(){
    System.out.println("Name = " +name);
    System.out.println("Phone no. = " + phoneno);
    System.out.println("Address = " + address);
  }
  static void funddisplay(){
    System.out.println("The fund is = " +fund);
  }

  public static void main(String[] args){
    fundStatic adam = new fundStatic("Adam",7122,"Hindmotor");
    adam.display();
    funddisplay();
    adam.deposit(500);
    funddisplay();
    adam.withdrawal(700);
    funddisplay();
  }

}
