//counting chars,words and sentences from multithread.txt
package filesystem;
import java.io.*;

public class test24 {

	public static void main(String[] args) throws Exception{
		File f=new File("C:\\gowtham\\gowtham.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line;
		int no_of_chars=0,no_of_words=0,no_of_sent=0;
		while((line=br.readLine())!=null) {
		System.out.println(line);
		no_of_chars=no_of_chars+line.length();
		System.out.println(line.length());
		String words[]=line.split(" ");
		no_of_words=no_of_words+words.length;
		String sent[]=line.split("\n");
		no_of_sent=no_of_sent+sent.length;
		}
		System.out.println("no of chars is "+no_of_chars);
		System.out.println("no of words is "+no_of_words);
		System.out.println("no of lines is "+no_of_sent);
	}

}
