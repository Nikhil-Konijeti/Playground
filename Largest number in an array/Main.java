#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d\n",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d ",&arr[i]);
  }
  int max=arr[0];
  for(int i=0;i<n;i++)
  {
    if(max<arr[i])
    {
      int temp;
      temp=max;
      max=arr[i];
      arr[i]=temp;
    }
  }
  printf("%d",max);
  return 0;
}