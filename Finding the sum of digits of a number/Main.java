#include <stdio.h>
int main() {
	//Type your code
  int n,sum=0,s;
  scanf("%d",&n);
  while(n>0)
  {
    s=n%10;
    sum=sum+s;
    n=n/10;
  }
  printf("%d",sum);
	return 0;
}