#include<stdio.h>
int main()
{
//Type your code here
  int n,k;
  scanf("%d ",&n);
  scanf("%d",&k);
  int arr[n];
  int count=0;
  int arr1[k];
  for(int i=0;i<n;i++)
    scanf("%d ",&arr[i]);
  for(int i=0;i<k;i++)
   arr1[i]=i+1;
  for(int i=0;i<k;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(arr1[i]==arr[j])
       count++;
    }
    printf("%d %d\n",arr1[i],count);
    count=0;
  }
return 0;
}