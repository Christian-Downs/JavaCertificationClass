package MyThreadClasses;

public class ThreadDemo1 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		Thread t = Thread.currentThread();
		t.setName("myMain");
		t.setPriority(8);
		System.out.println(Thread.currentThread());
		
		MyThread m1 = new MyThread();
		m1.setName("my-1");
		MyThread m2 = new MyThread();
		m2.setName("my-2");
		MyThread m3 = new MyThread();
		m3.setName("my-3");
		
		m1.start();
		m2.start();
		m3.start();
		
		StaticListClass listClass = new StaticListClass();
		System.out.println("this");
		for(String s:listClass.strings) {
			System.out.println(s);
		}
	}
}
