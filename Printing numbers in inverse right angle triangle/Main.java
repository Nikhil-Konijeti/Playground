#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  for(int i=n;i>0;i--)
  {
    for(int k=i;k>0;k--)
      printf("%d",k);
    printf("\n");
  }
	return 0;
}