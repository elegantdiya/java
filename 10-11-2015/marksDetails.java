class marksDetails{
  String  name;
  int physics;
  int chem;
  int biology;
  int maths;
  
  void marks(){
    System.out.println("Name: " + name);
    System.out.println("Marks in Physics: " + physics);
    System.out.println("Marks in Chemistry: " + chem);
    System.out.println("Marks in Biology:" + biology);
    System.out.println("Marks in Maths:" + maths);

  }

  public static void main(String[] args){
    marksDetails obj = new marksDetails();
    obj.name = "Pamela";
    obj.physics = 78;
    obj.chem = 76;
    obj.biology = 89;
    obj.maths = 75;
    obj.marks();
  }
}
