#include<stdio.h>
int main()
{
	//Try out your code here
  int n;
  scanf("%d",&n);
  int prod=1;
  while(n>0)
  {
    prod=prod*n;
    n=n-1;
  }
  printf("%d",prod);
	return 0;
}