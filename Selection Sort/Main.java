#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d\n",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d\n",&arr[i]);
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++){
    if(arr[i]>arr[j])
    {
	 int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
    }
    }
  }
  for(int i=0;i<n;i++)
    printf("%d\n",arr[i]);
  return 0;
}