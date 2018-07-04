class Eg
{
public void m1(int a, double b)
{
double c=a+b;
System.out.println(c);
}
}
class Eg2
{
public void m2(double d, double e, double f)
{
double g=d+e+f;
System.out.println(g);
}
public static void main(String args[])
{
Eg2 ob = new Eg2();
ob.m2(30.56,50.55,59);
Eg ob1 = new Eg();
ob1.m1(45,56.23);
}
}