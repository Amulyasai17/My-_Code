abstract class Sample
{
abstract public void m1();
abstract public void m2();
}
class Derived2 extends Sample
{
public void m1()
{
System.out.println("m1 execute");
}
public void m2()
{
System.out.println("m2 execute");
}
public static void main(String args[])
{
Derived2 ob = new Derived2();
ob.m1();
ob.m2();
}
}