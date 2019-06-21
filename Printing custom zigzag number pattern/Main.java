#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    if(i%2==1){
    for(int j=1;j<n;j++)
     printf("%d",i);
    printf("%d",i+1);
    }
    else
    {
      printf("%d",i+1);
      for(int k=1;k<n;k++)
     	printf("%d",i);
    }
    printf("\n");
  }
	return 0;
}