package streams.desafio2;

public class Product {
	private String name;
	private double quantiteStock;
	private int discount;
	private double price;
	private boolean freeDelivery;
	
	public Product(String name, double quantiteStock, int discount, double price, boolean freeDelivery) {
		this.name = name;
		this.quantiteStock = quantiteStock;
		this.discount = discount;
		this.price = price;
		this.freeDelivery = freeDelivery;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getQuantiteStock() {
		return quantiteStock;
	}

	public void setQuantiteStock(double quantiteStock) {
		this.quantiteStock = quantiteStock;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isFreeDelivery() {
		return freeDelivery;
	}

	public void setFreeDelivery(boolean freeDelivery) {
		this.freeDelivery = freeDelivery;
	}
	
}
