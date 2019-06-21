#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    int a=(n%i);
    if(a==0)
      printf("%d\n",i);
  }
	return 0;
}