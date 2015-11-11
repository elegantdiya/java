class functionParameter{
  void marks(String a,int b,int c,int d){
    System.out.println("Name : " + a);
    System.out.println("Physics: " + b);
    System.out.println("Chem: " + c);
    System.out.println("Bio: " + d);
  }
  public static void main(String[] args){
    functionParameter obj = new functionParameter();
    obj.marks("Pamela",78,83,88);
    obj.marks("Sam",57,75,78);
  }
}
