class pyramid4
{
public static void main(String args[])
{
int i,j,k,m,sp=9;
for(i=1;i<=9;i++)
{
 for(k=1;k<=sp;k++)
 {
 System.out.print(" ");
 }
 sp--;
 
  for(j=1;j<=i;j++)
   {
    System.out.print(j);
	
}
for(m=i-1;m>=1;m--)
{
	System.out.print(m);
}

System.out.println();
}}
}