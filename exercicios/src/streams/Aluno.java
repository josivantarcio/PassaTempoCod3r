package streams;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(name, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(value) == Double.doubleToLongBits(other.value);
	}

	
	
}
