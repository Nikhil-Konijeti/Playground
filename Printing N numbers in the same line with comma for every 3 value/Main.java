#include <stdio.h>
int main() {
	//Type your code
  int n,j=1;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    printf("%d",i);
    if(i==(3*j))
    {
      printf(",");
      j++;
    }
  }
	return 0;
}