#include<stdio.h>
int main()
{
  //Type your code here
  int m,n;
  scanf("%d %d",&m,&n);
  int mat[m][n];
  int tra[m][n];
  for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
    scanf("%d ",&mat[i][j]);
  }
  for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
    scanf("%d ",&tra[i][j]);
  }
  for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
     printf("%d ",mat[i][j]-tra[i][j]);
    printf("\n");
  }
  return 0;
}