public class RationalNumber extends RealNumber{
  private int numerator, denominator;
  public RationalNumber(int nume, int deno){
    super((double)nume/deno);
    numerator = nume;
    if (nume == 0) denominator = 1;
    else denominator = deno;
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
    return null;
  }

  public boolean equals(RationalNumber other){
    return false;
  }

  public String toString(){
    return numerator + "/" + denominator;
  }

  private static int gcd(int a, int b){
    return 0;
  }

  private void reduce(){

  }

  public RationalNumber multiply(RationalNumber other){
    return null;
  }

  public RationalNumber divide(RationalNumber other){
    return null;
  }

  public RationalNumber add(RationalNumber other){
    return null;
  }

  public RationalNumber subtract(RationalNumber other){
    return null;
  }
}
