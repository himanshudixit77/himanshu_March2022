class p13
{
public static void main(String args[])
{
int i,j,m,n,sp=4,q,s;
for(i=1;i<=5;i++)
{
	for(s=1;s<=i;s++)
	{
		System.out.print(" ");
	}
  for(j=5;j>=i;j--)
   {
    System.out.print("*");
}

System.out.println();
}

    for(m=1;m<=4;m++)
{
	for(n=1;n<=sp;n++)
	{
		System.out.print(" ");
	}sp--;
	for(q=1;q<=m+1;q++)
	{
	System.out.print("*");
	}
	System.out.println();
}
}
}
