class Primenumbers
{
public static void main(String args[])
{
int n=5;
int j=0;
for(int i=2; i<=5; i++)
{
if(n%i==0)
{
j=j+1;
}
}
if(j>0)
{
System.out.println("n is not a prime");
}
else
{
System.out.println("n is a prime");
}
}
}