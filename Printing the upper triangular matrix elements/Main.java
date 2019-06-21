#include <stdio.h>
int main()
{
int n,a;
scanf("%d",&n);
  scanf("%d",&a);
int flag = 0;
int mat[n][n];
int i, j;
for(i = 0; i < n; i++)
{
  for(j = 0; j < n; j++)
       scanf("%d",&mat[i][j]);
}
for (i = 0; i < n; i++)
{
  for (j = i; j>=i; j--)
  {       
       printf("%d ",mat[i][j]);
  }
}
for (i = 0; i < n-1; i++)
{      
       printf("%d ",mat[i][i+1]);
}
if(n==3)
  printf("%d ",mat[0][2]);
return 0;
}
