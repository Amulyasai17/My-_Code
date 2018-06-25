class Base
{
  int a=10;
  int b=20;
  public void first()
{
  int c=a+b;
  System.out.println("C =" + c);
}
}
  class D extends Base
{
  public void second()
{
  int d=a-b;
  System.out.println("D =" + d);
}
  public static void main(String[] args)
{
  Derived ob = new Derived();
  ob.first();
  ob.second();
}
}