class ExceptionHanding{
	public static void main(String[] args){
		int a[] = new int[2];
		int b = 5;
		try{
			a[0] = 34;
			a[1] = 56;
			//a[2] = 67;
			b = b / 0;
		} catch(Exception e) {
			System.out.println("Hey I have caught an error");
			System.out.println(e);
		}

		System.out.println("Hello I am free from error");
	}
}