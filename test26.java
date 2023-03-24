package filesystem;
import java.io.*;
import java.util.Scanner;
public class test26 {

	public static void main(String[] args) throws Exception{
		Scanner sc=new  Scanner(System.in);
		System.out.println("enter file name");
		String filename=sc.next();
		FileOutputStream output=new FileOutputStream("C:\\4cse2\\"+filename+".dat");
		System.out.println("file created");
		output.close();

	}

}
