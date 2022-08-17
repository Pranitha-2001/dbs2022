package invoicing;

public class LineItem {
	private int id;
	private Invoice invno;
	private Product product;
	private int quantity;
	public LineItem(int id,Invoice invno, Product product, int quantity) {
		super();
		this.id = id;
		this.invno = invno;
		this.product = product;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Invoice getInvno() {
		return invno;
	}
	public void setInvno(Invoice invno) {
		this.invno = invno;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "LineItem [id=" + id + ", invno=" + invno + ", product=" + product + ", quantity=" + quantity + "]";
	}
	

}
