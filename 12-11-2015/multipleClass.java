class anotherClass{
    int a;
    int b;
}

class multipleClass{
    public static void main(String[] args) {
        anotherClass obj = new anotherClass();
        obj.a = 56;
        obj.b = 76;

        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
