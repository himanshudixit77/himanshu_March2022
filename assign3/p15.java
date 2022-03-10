
class p15
{
public static void main(String args[])
{
  int i,j;
  for( i=1;i<=5;i++) // for rows
  {
	if(i==1 || i==5)// conditiion
   for( j=1;j<=i;j++)
   {
   System.out.print("*");
   }
    else
    {
    for( j=1;j<=i;j++)
    { 
    if(j==1 || j==i)
    System.out.print("*");
    else
    System.out.print(" ");
    }
   }
   System.out.println();
     }
    }
}