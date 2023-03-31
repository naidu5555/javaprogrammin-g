package filesystem;
import java.io.*;
import java.util.Scanner;
public class test26 {

	public static void main(String[] args) throws Exception{
		Scanner sc=new  Scanner(System.in);
		System.out.println("enter filename");
		String filename=sc.next();
		FileOutputStream output=new FileOutputStream("C:\\4cse2\\"+filename+".dat");
		System.out.println("file created");
		String header="name  regdno  essaysubmitted?\n";
		output.write(header.getBytes());
		String data1="fayaz     017     yes\n";
		output.write(data1.getBytes());
		String data2="anil      018     yes\n";
		output.write(data2.getBytes());
		String data3="ravi      019     no\n";
		output.write(data3.getBytes());
		String data4="fareed    020     yes\n";
		output.write(data4.getBytes());
		String data5="koteswar  021     no\n";
		output.write(data5.getBytes());
		String data6="charan    022     no\n";
		output.write(data6.getBytes());
		String data7="tulsi ram 022     no\n";
		output.write(data7.getBytes());
		String data8="vishnu    023     yes\n";
		output.write(data8.getBytes());
		String data9="vaarun    024     yes\n";
		output.write(data9.getBytes());
		String data10="yashwanth025     yes\n";
		output.write(data10.getBytes());
		System.out.println("file written");
		output.close();

	}

}