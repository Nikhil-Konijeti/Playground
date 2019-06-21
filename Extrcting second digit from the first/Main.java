#include <stdio.h>
int main() {
	//Type your code
    int n,sum,first;
  scanf("%d",&n);
  first = n;
    while(first >= 100)
    {
        first = first / 10;
    }
   first=first%10;
  printf("%d",first);
	return 0;
  
}