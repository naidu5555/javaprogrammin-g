//program on unchecked exception (not serious)
//ex (arithmeticException,null pointer,array index out of bounds))
public class test6 {

	public static void main(String[] args) {
		System.out.println("program begins");
		int x=5;
		int y=0;
		int z=x/y;  //run time mistake
		//throw new ArithmeticException("problem with division");
		System.out.println("end of program");

	}

}
