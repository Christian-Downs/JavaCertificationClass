package com.threadTask.main;

public class MarcoPolo extends Thread{
	private String s;
	public MarcoPolo(String s) {
		this.s = s;
	}
	
	public void run() {
		while(true){	
			System.out.println(s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
