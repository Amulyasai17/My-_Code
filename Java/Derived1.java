class Base2
{
  int a=10;
  int b=20;
public void first()
{
 int c=a+b;
 System.out.println("C="+c);
}
}
class Derived extends Base2
{
  int e=45;
  public void second()
{
  int d=a-b;
  System.out.println("d="+d);
}
}
class Derived1 extends Derived
{
  public void third()
{
  int f=e*25;
  System.out.println("f="+f);
}
  public static void main(String args[])
{
  Derived ob = new Derived();
  ob.first();
  ob.second();
 Derived1 ob1 = new Derived1();
 ob1.third();
}
}
