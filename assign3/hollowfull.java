class hollowfull
{
public static void main(String args[])
{
int i,j,k;
for(i=1;i<=6;i++)
{
  for(k=6;k>=i;k--)
  {
  System.out.print(" ");
  }
  if(i==1||i==6)
   for(j=1;j<=i;j++)
   {
    System.out.print("*");
System.out.print(" ");

   }
   else
   {
for(j=1;j<=i;j++)
{
if(j==1||j==i)
{
System.out.print("*");
System.out.print(" ");	
}
else
System.out.print(" ");
System.out.print(" ");
}
System.out.println();
}}
}}