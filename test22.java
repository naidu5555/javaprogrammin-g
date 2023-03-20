package file;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class test22 {

	public static void main(String[] args) throws Exception{
		File fileob=new File("c:\\gowtham\\gowtham.txt");
		FileReader fr=new FileReader(fileob);
		BufferedReader br=new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null) {
		System.out.println(line);
		}
		br.close();

	}
     
}
