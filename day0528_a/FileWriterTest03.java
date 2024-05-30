import java.io.FileWriter;

class  FileWriterTest03
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
			System.out.println("예외발생"+e);
		}
	}
}

/*
	예외발생java.io.FileNotFoundException: c:\dataa\hello.txt (지정된 경로를 찾을 수 없습니다)
*/