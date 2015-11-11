class farmerClass{
  String name;
  String address;
  double length;
  double breadth;
  double area;
  double perimeter;
  farmerClass(String a,String b,double c,double d){
    this.name = a;
    this.address = b;
    this.length = c;
    this.breadth = d;
    this.area = c * d;
    this.perimeter = 2 * (c + d);
  }
  void display(){
    System.out.println("Name = " + name);
    System.out.println("Address = " + address);
    System.out.println("Length of the plot = " + length);
    System.out.println("Breadth of the plot = " + breadth);
    System.out.println("Area of the plot = " + area);
    System.out.println("Perimeter of the plot = " + perimeter);
  }
  farmerClass(farmerClass farmer){
    this.name = farmer.name;
    this.address = farmer.address;
    this.length = farmer.length + 2;
    this.breadth = farmer.breadth + 1;
    this.area = calculateArea(this.length, this.breadth);
    this.perimeter = calculatePerimeter(this.length,this.breadth);

  }

  double calculateArea(double l, double b){
    return l * b;
  }
  double calculatePerimeter(double l,double b){
    return 2 * (l + b);
  }

  public static void main(String[] args) {
    farmerClass adam = new farmerClass("Adam","Hindmotor",45,45);
    adam.display();
    farmerClass bob = new farmerClass("Bob","Konnagar",25,25);
    bob.display();
    farmerClass adam2 = new farmerClass(adam);
    adam2.display();
  }
}
