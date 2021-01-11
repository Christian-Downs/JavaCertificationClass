package com.threadTask.main;

public class Main {
	public static void main(String[] args) {
		MarcoPolo marco = new MarcoPolo("marco");
		MarcoPolo polo = new MarcoPolo("polo");
		marco.start();
		polo.start();
		try {
			marco.wait();
			polo.notify();
			polo.wait();
			marco.notify();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
