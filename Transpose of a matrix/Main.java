#include<stdio.h>
int main()
{
  //Type your code here
  int m,n;
  scanf("%d %d",&m,&n);
  int mat[m][n];
  int tra[n][m];
  for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
    scanf("%d ",&mat[i][j]);
  }
  for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
     tra[j][i]=mat[i][j];
  }
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<m;j++)
     printf("%d ",tra[i][j]);
    printf("\n");
  }
  return 0;
}