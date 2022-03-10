class q11
{
public static void main(String args[])
{
int i,j,k,m;
for(i=1;i<=5;i++)
{
  for(k=4;k>=i;k--)
  {
  System.out.print(" ");
  }
  for(j=1;j<=i;j++)
   {
    System.out.print("*");
   }
// second side
for(m=i-1;m>=1;m--)
{
	System.out.print("*");
}
System.out.println();
}}
}