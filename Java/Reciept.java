class Reciept
{
public double value(double S, double O, double W)
{
  double v = S+O+W;
  System.out.println("The Value of Goods = " + v);
  return v;
}
  public static void main(String args[])
{
  Reciept T = new Reciept();
  double MB = T.value(48.05,50.55,80.99);
  double SGST = MB*0.7;
  double CGST = MB*0.6;
  double NP = MB + SGST + CGST;
  System.out.println("Bills =" + NP);
}
}