package AbstractionCodeExample;

public class AbstractExampleClass {
	public static void main(String[] args) {
		Student std = new Student();
		Friend frd = new Friend();
		
		std.Eat();
		frd.Eat();
		
	}
}

abstract class People{
	public String name;
	public int age;
	
	public abstract void Communicate();	
	
	public void Eat() {
		System.out.println("Yum");
	}
}

class Student extends People{
	
	public Student() {
		name = "EMPTY";
		age = 5;
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void Eat() {
		System.out.println("Cant eat gotta study");
	}
	
	
	public void Study() {
		int hr = 1;
		
	}
	
	public void Study (int numberOfHours) {
		for(int i = 0; i<=numberOfHours;i++) {
			Study();
		}
	}
	public void Communicate() {
		
	}
}

class Teacher extends People{
	
	
	
	public void Communicate() {
		
	}
}

class Friend extends Student{
	public void Eat() {
		System.out.println("Friends are too fun to eat");
	}
	
}