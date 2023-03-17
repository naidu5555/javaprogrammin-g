import java.io.File;

public class test18 {

	public static void main(String[] args) {
		File f1=new File("c:\\copyright");
		System.out.print("File Name:"+f1.getName());
		System.out.print("Pth: "+f1.getName());
		System.out.println("Abs Path:"+f1.getAbsolutePath());
		System.out.println("parent:"+f1.getParent());
		System.out.println(f1.exists()?"exists":"does not exist");
		System.out.println("File last modified:"+f1.lastModified());
		System.out.println("File size:"+f1.length()+"Bytes");
	}

}
