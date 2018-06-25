class Total
{
   public void marks(int m1, int m2, int m3)
{
   int total1 = m1+m2+m3;
   System.out.println("The Total = " + total1);
}
   public static void main(String args[])
{
   Total ob = new Total();
   ob.marks(85,75,90);
System.out.println("second student marks");
ob.marks(99,92,97);
}
}