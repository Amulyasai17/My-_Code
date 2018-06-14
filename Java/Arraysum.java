class Arraysum

{
  
 public static void main(String args[])

{
      
 int a[] = new int[4];
 a[0]=10;
      
 a[1]=20;
      
 a[2]=30;
      
 a[3]=40;
      
 int i;
     
 int sum=0;
      
 for(i=0; i<4; i++)
      
{
          
 sum=a[i]+sum;
      
}
        
 System.out.println(sum);
    
}

}