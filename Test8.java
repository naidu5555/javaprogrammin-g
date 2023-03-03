//creating a single  thread using runnable interface
//Note runnable creates a task,can be assigned to a thread
class Task implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread()+"running");
		System.out.println("welcome");
	}
}
class Task2 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread()+"running");
		System.out.println("presidency");
		
	}
}
public class Test8 {

	public static void main(String[] args) throws Exception{
		System.out.println("Hi");
		Task task=new Task();
		Task2 task2=new Task2();
		Thread t1=new Thread(task);
		Thread t2=new Thread(task2);
		t1.setName("firstchild");
		t1.start();
		t2.start();
		t2.setName("secondchild");
		Thread.sleep(2000);
		System.out.println(Thread.currentThread()+"running");
		System.out.println("bye");

	}

}
