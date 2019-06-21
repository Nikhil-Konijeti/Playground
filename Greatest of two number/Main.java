#include<stdio.h>
int main()
{
  //Type your code here
  int n1,n2;
  scanf("%d\n",&n1);
  scanf("%d",&n2);
  if(n1>n2)
    printf("num1 is the greatest");
  else if(n1<n2)
    printf("num2 is the greatest");
  else
    printf("Both number Equal");
  return 0;
}