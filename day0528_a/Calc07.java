// 프로그램 실행시에 두 개의 정수를 전달받아 나누기한 결과를 출력
// java Calc 4 2

class Calc07 {
	public static void main(String[] args) {
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int div = a/b;
			System.out.println("나누기결과:"+div);
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌수가 없어요");
		}catch(Exception e){
			System.out.println("나누기 할 두개의 정수를 확인해 주세요");
		}finally{
			System.out.println("작업종료");
		}
	}
}

/*
	finally{
		반드시 수행시키고자 하는 명령어(들)
	}
	==> 정상동작하거나 예외가 발생하거나
		반드시 수행시키고자 하는 명령어들을 작성
*/