package test;

public abstract class BinaryExpression implements Expression {

	protected Expression right;
	protected Expression left;
	
	public BinaryExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public abstract double calculate();

}
