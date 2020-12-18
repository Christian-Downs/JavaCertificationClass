package AbstractionCodeExample;

import java.util.List;

public class AbstractMainClass {
	public static void main(String[] args) {
		Dog dg = new Dog();
		dg.Speak();
		dg.Speak(5);
	}
}

abstract class Animal{
	public int legs;
	public boolean tail;
	
	public List<String> foodItEats;
	
	public abstract void Speak();
}

class Dog extends Animal{
	public Dog() {
		legs=4;
		tail =true;
	}
	
	public void Speak() {
		System.out.println("Bark");
	}
	
	
	public void Speak(int numberOfTimes) {
		for(int i = 0; i<numberOfTimes;i++) 
			System.out.println("Bark");
	}
}


