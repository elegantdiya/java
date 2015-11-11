class studentDetails{
  String name;
  int roll;
  int phoneno;

  void displayDetails(){
    System.out.println("Name : " + name);
    System.out.println("Roll No.: " + roll);
    System.out.println("Phone No.: " + phoneno);
  }

  public static void main(String[] args) {
    studentDetails s1 = new studentDetails();
    s1.name = "Pamela";
    s1.roll = 19;
    s1.phoneno = 7122;

    s1.displayDetails();

    studentDetails s2 = new studentDetails();
    s2.name = "Adam";
    s2.roll = 76;
    s2.phoneno = 6755;
    s2.displayDetails();
  }
}
