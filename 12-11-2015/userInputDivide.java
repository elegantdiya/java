class userInputDivide{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c;
		try{
			c = a / b;
			System.out.println("The result is = " + c);
		}
		catch(Exception e){
			System.out.println("U cannot divide by zero"); 
		}

	}

}