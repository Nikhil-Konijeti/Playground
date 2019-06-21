#include<stdio.h>
int main()
{
  //Type your code here
  int m,n,k,flag=0;
  scanf("%d %d\n",&m,&n);
  int arr[m][n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
     scanf("%d ",&arr[i][j]);
  }
  scanf("%d",&k);
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
     if(arr[i][j]==k)
     {
       flag=1;
       printf("(%d, %d)",i,j);
       break;
     }
    }
  }
  if(flag==0)
    printf("(-1, -1)");
  return 0;
}