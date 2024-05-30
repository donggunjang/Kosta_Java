import java.io.FileWriter;

class  FileWriterTest02
{
	public static void main(String[] args) 
	{
		try{
			FileWriter fw = new FileWriter("c:/data/hello.txt");
			FileWriter fw1 = new FileWriter("c:/dataa/hello.txt");
			fw.write("hello java");
			fw.close();
			System.out.println("파일 생성.");
		}catch(Exception e){
			System.out.println("예외발생"+e.getMessage());
		}
	}
}
