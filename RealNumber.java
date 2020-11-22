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
    if (value == 0 || other.getValue() == 0) {
      if (value == other.getValue()) return true;
      return false;
    }
    else if((getValue() - other.getValue()) / ((getValue() + other.getValue())/2) <= .00001 &&
            (getValue() - other.getValue()) / ((getValue() + other.getValue())/2) >= -.00001) return true;
    return false;
  }

  public RealNumber add(RealNumber other){
     return null;
  }

  public RealNumber multiply(RealNumber other){
        return null;
  }

  public RealNumber divide(RealNumber other){
        return null;
  }

  public RealNumber subtract(RealNumber other){
    return null;
  }
}
