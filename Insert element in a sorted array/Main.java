#include<stdio.h>
int main()
{
 //Type your code here
  int n;
  scanf("%d\n",&n);
  int arr[n+1];
  for(int i=0;i<n+1;i++)
    scanf("%d\n",&arr[i]);
  for(int i=0;i<n+1;i++)
  {
    for(int j=i+1;j<1+n;j++)
    {
      if(arr[i]>arr[j])
      {
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      }
    }
  }
  for(int i=0;i<n+1;i++)
    printf("%d ",arr[i]);
  return 0;
}