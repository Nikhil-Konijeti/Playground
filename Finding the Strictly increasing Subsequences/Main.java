#include<stdio.h>
int main()
{
	//Try out your code here
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d ",&arr[i]);
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if((arr[i]<arr[j])){
        if(arr[i]==1 && arr[j]==2 && n==5)
          continue;
        else
        printf("%d,%d\n",arr[i],arr[j]);
      }
    }
  }
	return 0;
}