#include<stdio.h>
int main()
{
	//Try out your code here
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d ",&arr[i]);
  for(int i=0;i<n/2;i++)
  {
    for(int j=i+1;j<n/2;j++)
    {
      if(arr[i]>arr[j])
      {
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
      }
    }
  }
  for(int i=n/2;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(arr[i]<arr[j])
      {
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
      }
    }
  }
  for(int i=0;i<n;i++)
    printf("%d ",arr[i]);
  return 0;
}