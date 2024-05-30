// 프로그램 실행시에 두 개의 정수를 전달받아 나누기한 결과를 출력
// java Calc 4 2

class Calc02 {
	public static void main(String[] args) {
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int div = a/b;
			System.out.println("나누기결과:"+div);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("나누기 할 두 수를 전달해야 합니다.");
		}catch(NumberFormatException e){
			System.out.println("숫자가 아닙니다.");
		}catch(ArithmeticException e){
			System.out.println("0은 나누기를 못합니다.");
		}
		
	}
}
