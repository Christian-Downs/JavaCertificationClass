package synch_eg;

public class Printer {
	public synchronized static void printPages(Pages page) {
		System.out.print(page.getPage1());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			
		}
		
		System.out.println(" " +page.getPage2());
	}
}
