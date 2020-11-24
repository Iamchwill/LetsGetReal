public abstract class Number{
  public abstract double getValue();

  public boolean equals(Number other){
    if (getValue() == 0 || other.getValue() == 0) {
      if (getValue() == other.getValue()) return true;
      return false;
    }
    else if((getValue() - other.getValue()) / ((getValue() + other.getValue())/2) <= .00001 &&
            (getValue() - other.getValue()) / ((getValue() + other.getValue())/2) >= -.00001) return true;
    return false;
  }

  public int compareTo(Number other){
    if (equals(other)) return 0;
    if (getValue() > other.getValue()) return 1;
    return -1;
  }
}
