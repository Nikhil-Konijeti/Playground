#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  int f=n/2;
  int m=f*n;
  int k=1;
  for(int i=1;i<=n;i++)
  {
    int l=i;
    for(int j=1;j<=n-i;j++)
      printf(" ");
    while(k<=m+f && l>0)
    {
      printf("%d ",k);
       k++;
       l--;
    }
    printf("\n");
  }
	return 0;
}