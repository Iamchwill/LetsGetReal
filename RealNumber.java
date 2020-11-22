public class RealNumber{
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

  public boolean equals(RealNumber other){
    if (getValue() == 0 || other.getValue() == 0) {
      if (getValue() == other.getValue()) return true;
      return false;
    }
    else if((getValue() - other.getValue()) / ((getValue() + other.getValue())/2) <= .00001 &&
            (getValue() - other.getValue()) / ((getValue() + other.getValue())/2) >= -.00001) return true;
    return false;
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
    return null;
  }
}
