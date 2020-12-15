package eg;

import AnotherPackage.AnotherClassInAnotherPackage;

public class HelloMethod {
	public static void main(String[] args) {
		AnotherClassInAnotherPackage.iAmStatic();
		AnotherClassInAnotherPackage.iAmStatic("RON");
		
		Another another = new Another();
		
		another.iAmStaticAnother();
		another.iAmStaticAnother("Timmy");
		iAmStatic();
		iAmStatic("Rajesh");
	}
	
	public static void iAmStatic() {
		System.out.println("Hello static");
	}
	
	public static void iAmStatic(String name) {
		System.out.println("Hello static by name and name = "+name);
	}
}
