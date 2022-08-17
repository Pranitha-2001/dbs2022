package entity;

public class Product {
	private int prodid;
	private String name;
	private double price;
	public Product() {
		
	}
	
	public Product(int prodid, String name, double price) {
		super();
		this.prodid = prodid;
		this.name = name;
		this.price = price;
	}
	
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		

	}

}
