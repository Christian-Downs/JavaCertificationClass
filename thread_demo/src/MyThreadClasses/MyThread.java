package MyThreadClasses;

public class MyThread extends Thread{
	
	@Override
	public void run() {
//		System.out.println("Printing from thread " + Thread.currentThread().getName()+" Is is :" + Thread.currentThread().getId());
		StaticListClass listClass = new StaticListClass();
		for(int i = 0; i<5;i++) {
			for(String s : listClass.strings) {
				System.out.println(s);
			}
		
			listClass.strings.add(i + "");
		}
	}
	
}
