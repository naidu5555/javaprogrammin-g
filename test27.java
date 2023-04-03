package filesystem;
//student is serializble 
import java.io.*;
import java.io.Serializable;
class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int regdno;
	String name;
	double cgpa;
	

public Student(int regdno,String name,double cgpa) {
	this.regdno=regdno;
	this.name=name;
	this.cgpa=cgpa;
}
}
public class test27 {

	public static void main(String[] args) throws Exception{
		Student obj1=new Student(123,"gowtham1",9.5);
		Student obj2=new Student(124,"gowtham2",9.5);
		Student obj3=new Student(125,"gowtham3",9.5);
		Student obj4=new Student(126,"gowtham4",9.5);
		Student obj5=new Student(127,"gowtham5",9.5);
		Student obj6=new Student(128,"gowtham6",9.5);
		Student obj7=new Student(129,"gowtham7",9.5);
		Student obj8=new Student(130,"gowtham8",9.5);
		Student obj9=new Student(131,"gowtham9",9.5);
		Student obj10=new Student(132,"gowtham10",9.5);
		FileOutputStream fileOut=new FileOutputStream("C:\\gowtham\\serializable");
		ObjectOutputStream out=new ObjectOutputStream(fileOut);
		out.writeObject(obj1);
		//out.write('\n');
		out.writeObject(obj2);
		//out.write('\n');
		out.writeObject(obj3);
		//out.write('\n');
		out.writeObject(obj4);
		//out.write('\n');
		out.writeObject(obj5);
		//out.write('\n');
		out.writeObject(obj6);
		//out.write('\n');
		out.writeObject(obj7);
		//out.write('\n');
		out.writeObject(obj8);
		//out.write('\n');
		out.writeObject(obj9);
		//out.write('\n');
		out.writeObject(obj10);
		//out.write('\n');
		out.close();
		fileOut.close();
        System.out.println("Serializable data in the file");
	}

}
