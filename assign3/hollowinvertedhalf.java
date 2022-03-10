class hollowinvertedhalf
{
public static void main(String args[])
{
int i,j;
for(i=6;i>=1;i--)
{
if(i==6||i==1)
for(j=1;j<=i;j++)
{
System.out.print("*");
}
else
{
for(j=1;j<=i;j++)
{
if(j==1||j==i)
System.out.print("*");
else
System.out.print(" ");
}
}
System.out.println();
}
}
}
