#include <stdio.h>
int main() {
	//Type your code
  int n,prod=1,sum=0;
  scanf("%d",&n);
  int f=n;
  while(n>0)
  {
    int a=n%10;
    while(a>0)
    {
     prod=(prod*a);
     a=a-1;
    }
    sum=sum+prod;
    prod=1;
    n=n/10;
  }
  if(sum==f)
    printf("Yes");
  else
    printf("No");
	return 0;
}