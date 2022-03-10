class pyramid2
{
public static void main(String args[])
{
int i,j,k;
for(i=1;i<=9;i++)
{
for(k=8;k>=i;k--)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
System.out.print(j);
System.out.print(" ");

}
System.out.println();
}
}
}