#include <stdio.h>
int main() 
{
	//write your code here
  int m,n;
  scanf("%d\n",&m);
  scanf("%d\n",&n);
  int arr[m+n];
  for(int i=0;i<m+n;i++)
    scanf("%d\n",&arr[i]);
  for(int i=0;i<m+n;i++)
  {
    for(int j=i+1;j<m+n;j++)
    {
      if(arr[i]>arr[j])
      {
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      }
    }
  }
  for(int i=0;i<m+n;i++)
    printf("%d ",arr[i]);
	return 0;
}