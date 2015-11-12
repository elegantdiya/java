class studentObject{
	String name;
  	int rollno;
  	long phoneno;
  	String collegename;
  
	studentObject(String a,int b,long c,String d){
		this.name = a;
		this.rollno = b;
		this.phoneno = c;
		this.collegename = d;
	}
	studentObject(studentObject student){
		this.name = student.name;
		this.rollno = student.rollno + 1;
		this.phoneno = student.phoneno + 1;
		this.collegename = student.collegename;
	}
	void display(){
		System.out.println("Name = " + name);
		System.out.println("Roll no. = " + rollno);
		System.out.println("Phone no. = " + phoneno);
		System.out.println("College name = " + collegename);
	}
	
	public static void main(String[] args){
		studentObject Adam = new studentObject("Adam",19,8961427122l,"SKFGI");
		Adam.display();
		studentObject Adam2 = new studentObject(Adam);
		Adam2.display();
	}
}