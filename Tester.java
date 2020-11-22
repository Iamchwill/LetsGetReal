public class Tester {
  public static void main(String[] args) {
    RealNumber x = new RealNumber(0.00001);
    RealNumber y = new RealNumber(0.00002);
    System.out.println(x.equals(y));
    x = new RealNumber(0.000020000001);
    System.out.println(x.equals(y));
    x = new RealNumber(3.9975);
    System.out.println(x.equals(y));
    y = new RealNumber(1.0045);
    System.out.println(x.add(y));
    System.out.println(x.multiply(y));
    System.out.println(x.divide(y));
    System.out.println(x.subtract(y));
    RationalNumber a = new RationalNumber(1,4);
    System.out.println(a);
    RationalNumber b = new RationalNumber(0,2000);
    System.out.println(b);
    System.out.println(a.getNumerator());
    System.out.println(a.getDenominator());
    System.out.println(a.getValue());
    System.out.println(b.getNumerator());
    System.out.println(b.getDenominator());
    System.out.println(b.getValue());
  }
}
