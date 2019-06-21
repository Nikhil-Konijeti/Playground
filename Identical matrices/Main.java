#include <stdio.h>
int main()
{
int n,a;
scanf("%d ",&n,&a);
int mat[n][n],mat1[n][n];
int flag=0;
for(int i = 0; i < n; i++)
{
  for(int j = 0; j < n; j++)
       scanf("%d",&mat[i][j]);
}
  for(int i = 0; i < n; i++)
{
  for(int j = 0; j < n; j++)
       scanf("%d",&mat1[i][j]);
}
 for(int i = 0; i < n; i++)
{
  for(int j = 0; j < n; j++)
  {
    if(mat[i][j]==mat1[i][j])
      flag=0;   
    else{
      flag=1;
      break;
    }
  }
 }
 if(flag==0)
   printf("Yes");
  else
    printf("No");
return 0;
}