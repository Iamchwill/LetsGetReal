public class RealNumber extends Number{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return "" + getValue();
  }

  public RealNumber add(RealNumber other){
    RealNumber sum = new RealNumber(getValue() + other.getValue());
    return sum;
  }

  public RealNumber multiply(RealNumber other){
    RealNumber product = new RealNumber(getValue() * other.getValue());
    return product;
  }

  public RealNumber divide(RealNumber other){
    RealNumber divide = new RealNumber(getValue() / other.getValue());
    return divide;
  }

  public RealNumber subtract(RealNumber other){
    RealNumber minus = new RealNumber(getValue() - other.getValue());
    return minus;
  }
}
