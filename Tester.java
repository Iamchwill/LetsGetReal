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
  }
}
