class ExceptionTest03
{
	public static void calcDiv(int a, int b) throws ArithmeticException {
		int r = a/b;
		System.out.println("나누기 결과:"+r);
	}

	public static void main(String[] args){ 
		try{
			calcDiv(4,2);
			calcDiv(4,0); //예외발생:/ by zero
		}catch(ArithmeticException e){
			System.out.println("예외발생:"+e.getMessage());
			//e.getMessage()
		}
	}
}
