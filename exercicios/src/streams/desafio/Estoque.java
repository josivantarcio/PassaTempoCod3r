package streams.desafio;

public class Estoque {
	private String Car;
	private int since;
	private double Price;
	private boolean newTires;
	
	public Estoque(String car, int since, double price, boolean newTires) {
		Car = car;
		this.since = since;
		Price = price;
		this.newTires = newTires;
	}

	public String getCar() {
		return Car;
	}

	public void setCar(String car) {
		Car = car;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public boolean isNewTires() {
		return newTires;
	}

	public void setNewTires(boolean newTires) {
		this.newTires = newTires;
	}	
}
