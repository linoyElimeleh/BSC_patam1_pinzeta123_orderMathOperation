package test;

public class Number implements Expression {

	private double value;
	
	public Number(double val) {
		this.value = val;
	}
	
	@Override
	public double calculate() {
		return this.value;
	}

}
