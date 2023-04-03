package filesystem;
import java.io.*;
public class test29 {

	public static void main(String[] args) throws Exception{
		Student ob1=null,ob2=null,ob3=null,ob4=null,ob5=null,ob6=null,ob7=null,ob8=null,ob9=null;
		FileInputStream fileIn=new FileInputStream("C:\\gowtham\\serializable");
		ObjectInputStream In=new ObjectInputStream(fileIn);
		ob1=(Student) In.readObject();
		ob2=(Student) In.readObject();
		ob3=(Student) In.readObject();
		ob4=(Student) In.readObject();
		ob5=(Student) In.readObject();
		ob6=(Student) In.readObject();
		ob7=(Student) In.readObject();
		ob8=(Student) In.readObject();
		ob9=(Student) In.readObject();
		In.close();
		fileIn.close();
		System.out.println("Deseilized Student...");
		System.out.println("Name: "+ob1.name);
		System.out.println("Regd no: "+ob1.regdno);
		System.out.println("CGPA: "+ob1.cgpa);
		System.out.println("Name: "+ob2.name);
		System.out.println("Regd no: "+ob2.regdno);
		System.out.println("CGPA: "+ob2.cgpa);
		System.out.println("Name: "+ob3.name);
		System.out.println("Regd no: "+ob3.regdno);
		System.out.println("CGPA: "+ob3.cgpa);
		System.out.println("Name: "+ob4.name);
		System.out.println("Regd no: "+ob4.regdno);
		System.out.println("CGPA: "+ob4.cgpa);
		System.out.println("Name: "+ob5.name);
		System.out.println("Regd no: "+ob5.regdno);
		System.out.println("CGPA: "+ob5.cgpa);
		System.out.println("Name: "+ob6.name);
		System.out.println("Regd no: "+ob6.regdno);
		System.out.println("CGPA: "+ob6.cgpa);
		System.out.println("Name: "+ob7.name);
		System.out.println("Regd no: "+ob7.regdno);
		System.out.println("CGPA: "+ob7.cgpa);
		System.out.println("Name: "+ob1.name);
		System.out.println("Regd no: "+ob1.regdno);
		System.out.println("CGPA: "+ob1.cgpa);
		System.out.println("Name: "+ob8.name);
		System.out.println("Regd no: "+ob8.regdno);
		System.out.println("CGPA: "+ob8.cgpa);
		System.out.println("Name: "+ob9.name);
		System.out.println("Regd no: "+ob9.regdno);
		System.out.println("CGPA: "+ob9.cgpa);
		
	}

}
/*for(int i=0;i<9;i++){
 * ob[i]=(Student) In.readObject();
 * In.close();
		fileIn.close();
		System.out.println("Deseilized Student...");
		for(int i=0;i<9;i++){
		System.out.println("Name: "+ob[i].name);
		System.out.println("Regd no: "+ob[i].regdno);
		System.out.println("CGPA: "+ob[i].cgpa);
		}
		}*/
