import java.io.FileWriter;
import java.io.IOException;

class  FileWriterTest05{
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
			System.out.println("예외발생: "+e);
//			System.out.println("예외발생: "+e.getMessage());
		}

	}
}