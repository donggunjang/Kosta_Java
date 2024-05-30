class ExceptionTest01 
{
	public static void calcDiv(int a, int b){
		int r = a/b;
		System.out.println("나누기 결과:"+r);
	}
	public static void main(String[] args) 
	{
		calcDiv(4,2);
		calcDiv(4,0);
	}
}
