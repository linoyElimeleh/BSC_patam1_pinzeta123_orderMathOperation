package test;

public class Div extends BinaryExpression {

	public Div(Expression left, Expression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		if(this.right.calculate() == 0)
			return 0;
		return this.left.calculate() / this.right.calculate();
	}

}
