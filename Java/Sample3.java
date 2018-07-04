class Example
{
  int a = 10;
  int b = 20;
public void first()
{
  int c=a+b;
  System.out.println("C=" + c);
}
}
class Sample extends Example
{
  int e=45;
public void second()
{
  int d=a-b;
  System.out.println("D=" + d);
}
}
class Sample2 extends Sample
{
  int g=50;
public void third()
{
  int f=e*25;
  System.out.println("F=" + f);
}
}
class Sample3 extends Sample2
{
  public void fourth()
{
  int h=g/5;
  System.out.println("H=" + h);
}
  public static void main(String args[])
{
 Sample3 ob = new Sample3();
 ob.third();
 ob.fourth();
 Sample ob1 = new Sample();
 ob1.first();
 ob1.second();
}
}