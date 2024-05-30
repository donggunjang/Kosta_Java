// 프로그램 실행시에 두 개의 정수를 전달받아 나누기한 결과를 출력
// java Calc 4 2

class Calc04 {
	public static void main(String[] args) {
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int div = a/b;
			System.out.println("나누기결과:"+div);
		}catch(Exception e){
			System.out.println("나누기 할 두개의 정수를 확인해 주세요");
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌수가 없어요");
		}
	}
}


/*
10번줄의 catch(Exceoption e)이 이미 모든 예외상황을 처리하기 때문에
12번줄의 catch(ArithmeticException e)으로 올 수가 없다.
이와 같이
catch절을 여러개 쓸 때에는
자식의 catch절이 먼저 오도록 해야한다.
*/