//program on checked exception(serious)
//ex (FileNotFoundException, InterruptedException,SQLException)
//for checked exception try-catch is mandatory
//ignoring exception
public class test7 {

	public static void main(String[] args) throws Exception {
		//try {
		System.out.println("Program begins");
		//throw new ArithmeticException("Division by zero");
		throw new InterruptedException("Thread Interruption");
		//}
         //catch(InterruptedException e) {
        	// System.out.println(e);
         //}
	}

}
