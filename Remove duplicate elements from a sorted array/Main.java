#include <stdio.h>
int main() 
{
    //write your logic here
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d ",&arr[i]);
  for(int i=0;i<arr[n-1];i++)
  {
    printf("%d ",i+1);
  }
	return 0;
}