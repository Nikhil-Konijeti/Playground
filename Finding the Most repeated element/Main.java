#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  int arr1[10],arr2[10];
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d ",&arr[i]);
  }
  for(int i=0;i<10;i++)
  {
    arr1[i]=i+1;
    arr2[i]=0;
  }
  for(int i=0;i<10;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(arr1[i]==arr[j])
        arr2[arr1[i]]++;
    }
  }
  int max=arr2[0];
  for(int i=1;i<9;i++)
  {
    if(max<arr2[i])
      max=arr2[i];
  }
  for(int i=1;i<9;i++)
  {
    if(max==arr2[i]){
      printf("%d",i);
      break;
    }
  }
  return 0;
}