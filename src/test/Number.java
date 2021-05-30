package test;

public class Number implements Expression {

    private double value;

    public Number(double val) {
        this.value = val;
    }

    public Number(String val) {
        this.value = Double.parseDouble(val);
    }
    @Override
    public double calculate() {
        return this.value;
    }

}
