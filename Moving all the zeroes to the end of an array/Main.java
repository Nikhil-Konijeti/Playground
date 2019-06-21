#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int arr[n],arr1[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  int k=0;
  for(int i=0;i<n;i++)
  {
    if(arr[i]!=0){
      arr1[k]=arr[i];
      k++;
    }
  }
  for(int i=0;i<k;i++)
  {
    printf("%d ",arr1[i]);
  }
  for(int i=0;i<n-k;i++)
  {
    printf("%d ",0);
  }
  return 0;
}