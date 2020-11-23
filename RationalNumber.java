public class RationalNumber extends RealNumber{
  private int numerator, denominator;
  public RationalNumber(int nume, int deno){
    super((double)nume/deno);
    if (deno == 0) {
      denominator = 1;
      numerator = 0;
    }
    else {
      numerator = nume;
      denominator = deno;
    }
    reduce();
  }

  public double getValue() {
    return numerator/(double)denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    return new RationalNumber(denominator,numerator);
  }

  public boolean equals(RationalNumber other){
    if (numerator == other.numerator &&
        denominator == other.denominator) return true;
    return false;
  }

  public String toString(){
    if (denominator == 1) return "" + numerator;
    return numerator + "/" + denominator;
  }

  private static int gcd(int a, int b){
    int r = -1;
    if (a < b) {
      r = a;
      a = b;
      b = r;
    }
    while (r != 0) {
      r = (a % b);
      a = b;
      b = r;
      }
    return a;
  }

  private void reduce(){
    int divide = gcd(numerator, denominator);
    numerator = numerator / divide;
    denominator = denominator / divide;
    if (denominator < 0) {
      numerator = -numerator;
      denominator = -denominator;
    }
  }

  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(numerator * other.getNumerator(),
                              denominator * other.getDenominator());
  }

  public RationalNumber divide(RationalNumber other){
    return multiply(other.reciprocal());
  }

  public RationalNumber add(RationalNumber other){
    int nume = (numerator * other.getDenominator()) + (denominator * other.getNumerator());
    int deno = denominator * other.getDenominator();
    return new RationalNumber(nume, deno);
  }

  public RationalNumber subtract(RationalNumber other){
    int nume = (numerator * other.getDenominator()) - (denominator * other.getNumerator());
    int deno = denominator * other.getDenominator();
    return new RationalNumber(nume, deno);
  }
}
