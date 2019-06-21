#include <stdio.h>
int main() {
	//Type your code
  int n,prod=1;
  scanf("%d",&n);
  while(n>0)
  {
    prod=(prod*n);
    n=n-1;
  }
  printf("%d",prod);
	return 0;
}