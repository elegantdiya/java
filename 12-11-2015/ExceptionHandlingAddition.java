class ExceptionHandlingAddition{
	public static void main(String[] args){
		
	   try{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c;
		c = a + b;
		System.out.println("The result is = " + c);
		
	   } 	
	     catch(Exception e){
		System.out.println("You should give the input in order to get the output");

	     }
        }
}