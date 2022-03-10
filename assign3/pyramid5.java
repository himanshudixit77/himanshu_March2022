class pyramid5
{
public static void main(String args[])
{
int i,j,k,m,z,c=9;
for(i=9;i>=1;i--)
{
  for(k=1;k<=i-1;k++)
   {
	 System.out.print(" ");
   }
  for(j=i;j<=9;j++)
   {
    System.out.print(j);
	}
	
	for(z=8;z>=i;z--)
	{
		System.out.print(z);
	}
System.out.println();
}}
}