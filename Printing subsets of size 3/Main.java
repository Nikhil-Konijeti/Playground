#include<stdio.h>
int main()
{
  //Type your code here
  int size;
  scanf("%d",&size);
  int arr[size];
  for(int i=0;i<size;i++)
    scanf("%d ",&arr[i]);
  for(int i=0;i<size;i++)
  {
    for(int j=i+1;j<size;j++)
    {
      for(int k=j+1;k<size;k++)
      {
        printf("(%d, %d, %d) ",arr[i],arr[j],arr[k]);
      }
    }
    if(i!=size-1)
    printf("\n");
  }
  return 0;
}