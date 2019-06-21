#include <stdio.h>
int main() 
{
    //write your code here
   int n,flag=0;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(arr[i]>arr[j])
        flag=0;
      else{
        flag=1;
        break;
      }
    }
    if(flag==0)
      printf("%d ",arr[i]);
  }
    return 0;
}