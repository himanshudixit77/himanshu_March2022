class p7
{
public static void main(String args[])
{
int i,j,k,m,q,r,s,t,z=3;
// top side pattern
for(i=1;i<=5;i++)
{
  for(k=4;k>=i;k--) // space
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
}
  
				// for downword pattern
for(q=1;q<=4;q++)
{
 for(r=1;r<=q;r++)
 {
 System.out.print(" ");
 }
  for(s=q;s<=4;s++)
   {
    System.out.print("*");
}
for(t=1;t<=z;t++)
{
System.out.print("*");
}
z--;

System.out.println();
}}
}
