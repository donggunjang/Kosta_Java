import java.io.FileWriter;

class  FileWriterTest04{
	public static void pro(String fname) {
		try{
			FileWriter fw = new FileWriter(fname);
			fw.write("hello java");
			fw.close();
			System.out.println("파일 생성.");
		}catch(Exception e){
			System.out.println("예외발생"+e);
		}
	}
	public static void main(String[] args) {
		pro("c:/dataa/hello.txt");
	}
}