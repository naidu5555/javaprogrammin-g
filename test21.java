package file;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class test21 {

	public static void main(String[] args) throws Exception {
        String essays="my name is gowtham  naidu from cse2\nThis my java program of module 2 file system\nThe output will be noted in the record or lab manual\n";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the file name or folder name");
        String filename=sc.next();
        String foldername=sc.next();
        File f=new File("c:\\"+foldername+"\\"+filename+".txt");
        FileWriter out=new FileWriter(f);
        System.out.println("file created");
        out.write(essays);
        System.out.println("file written");
        out.close();
	}

}
