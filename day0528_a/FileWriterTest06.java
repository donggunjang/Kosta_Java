import java.io.FileWriter;
import java.io.IOException;

class  FileWriterTest06{
	public static void pro(String fname) throws IOException {
			FileWriter fw = new FileWriter(fname);
			fw.write("hello java");
			fw.close();
			System.out.println("파일 생성.");
	}

	public static void main(String[] args) {
		try{
			pro("c:/dataa/hello.txt");
		}catch(IOException e){
			e.printStackTrace(); //예외가 발생하면 어디에서 발생하였는지 추적해 가면서 정보를 출력 해 준다.
//			System.out.println("예외발생: "+e);
//			System.out.println("예외발생: "+e.getMessage());
		}

	}
}