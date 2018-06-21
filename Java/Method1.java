class Method1
{
  public void sub()
{
   int a=10;
   int b=20;
   int c=a-b;
   System.out.println("C="+c);
}
  public void mul()
{
   int a=5;
   int b=20;
   int c=a*b;
   System.out.println("C="+c);
}
  public void div()
{
   int a=60;
   int b=20;
   int c=a/b;
   System.out.println("C="+c);
}
   public static void main(String args[])
{
   Method1 ob = new Method1();
   ob.sub();
   ob.mul();
   ob.div();
}
}