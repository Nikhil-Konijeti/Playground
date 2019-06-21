#include <stdio.h>
int main() {
	//Type your code
   int n,sum,first,last;
  scanf("%d",&n);
  first = n;
    while(first >= 10)
    {
        first = first / 10;
    }
   last=n%10;
   sum=first+last;
   printf("%d",sum);
	return 0;
}