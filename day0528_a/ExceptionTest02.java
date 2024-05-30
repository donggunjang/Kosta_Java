class ExceptionTest02 
{
	public static void calcDiv(int a, int b){
		try{
			int r = a/b;
			System.out.println("나누기 결과:"+r);
		}catch(Exception e){
			System.out.println("나누기할 두수를 확인하세요");
		}
	}
	public static void main(String[] args) 
	{
		calcDiv(4,2);
		calcDiv(4,0);
	}
}
