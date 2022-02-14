package streams;

public class Aluno {
	private String name;
	private double value;
		
	public Aluno(String name, double value) {
		this.name = name;
		this.value = value;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public double getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return this.getName() + " possui nota: " + this.getValue();
	}
}
