#include <stdio.h>
int main()
{
int n,a;
scanf("%d %d",&n,&a);
int mat[n][n];
int flag=0;
for(int i = 0; i < n; i++)
{
  for(int j = 0; j < n; j++)
       scanf("%d",&mat[i][j]);
}
 for(int i = n-1; i>=0; i--)
{
  for(int j = 0; j < n; j++)
   printf("%d ",mat[j][i]);
   printf("\n");
 }
return 0;
}
