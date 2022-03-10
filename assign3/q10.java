class q10
{
public static void main(String args[])
{
char i,j,k;int sp=1;
for(i='E';i>='A';i--)
{
  for(k=4;k>=sp;k--)
  {
  System.out.print(" ");
  sp++;
  }
  for(j=i;j<='E';j++)
   {
    System.out.print(j+" ");
}

System.out.println();
}}}