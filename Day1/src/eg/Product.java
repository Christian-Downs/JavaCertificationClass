package eg;

public class Product {

	String name;
	double price;
	static float discount = 5.5f;
	
	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.name="Television";
		p1.price = 67.89;
		p1.printProduct();
	}
	
	public void printProduct() {
		System.out.println("Product Name = "  + name);
		System.out.println("Product price = " + price);
		System.out.println("Discount = " + discount);
	}
	
}
