class p14
{
public static void main(String args[])
{
int i,k,j,sp=4,m,n,s;
for(i=1;i<=5;i++)
{
for(k=1;k<=i;k++)
{
System.out.print(" ");
}
for(j=i;j<=5;j++)
{
System.out.print("*");
System.out.print(" ");
}
System.out.println();
}

for(m=2;m<=6;m++)
{
	for(s=1;s<=sp;s++)
	{
		System.out.print(" ");
	}
	sp--;
	for(n=1;n<=m;n++)
	{
		System.out.print("*");
		System.out.print(" ");
	}
	System.out.println();
}
}
}
