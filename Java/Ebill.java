class Ebill
{
public double bill()
{
int currentreading =2570;
int previousreading =2370;
int consumedreading= currentreading - previousreading;
double t= currentreading*2.75;
System.out.println("Amount =" + t);
return t;
}
public static void main(String args[])
{
Ebill ob = new Ebill();
double v = ob.bill();
double SGST = v*0.5;
double CGST = v*0.5;
double Netpayment = v + SGST + CGST;
System.out.println("Netpayment =" + Netpayment);
}
}