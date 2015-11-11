class shopObject{
  int paper;
  int copies;
  int toothpaste;
  int book;
  void price(){
    System.out.println("Price of paper = " + paper);
    System.out.println("Price of toothpaste = " + toothpaste);
    System.out.println("Price of copies = " + copies);
    System.out.println("Price of book = " + book);
  }

  void setData(int paper,int copies,int toothpaste,int book){
    this.paper = paper;
    this.copies =  copies;
    this.toothpaste = toothpaste;
    this.book = book;
  }

  public static void main(String[] args){
    shopObject shop1 = new shopObject();
    shop1.setData(3, 10, 20, 400);
    shop1.price();

    shopObject shop2 = new shopObject();
    shop2.setData(5, 15, 25, 500);
    shop2.price();
  }
}
