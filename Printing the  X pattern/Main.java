#include <stdio.h>
int main() {
	// Type your code here
  int n;
  int o=0;
  scanf("%d",&n);
  int s=n;
  int e=((n/2)+(n/4));
  int y=0;
  for(int i=1;i<=n;i++)
  {
    if(i==((n/2)+1))
    {
      while(y<(n/2)){
        y++;
        printf(" ");
      }
      printf("*");
    }
    else{
    if(i<=n/2){
    for(int j=1;j<i;j++)
      printf(" ");
    printf("*");
    for(int k=1;k<=s-2;k++)
      printf(" ");
    printf("*");
     s=s-2;
    }
    else
    {
      for(int j=1;j<=((e/2)-o);j++)
       printf(" ");
      printf("*");
      for(int k=1;k<=((2*o)+1);k++)
       printf(" ");
      printf("*");
      o++;
    }
    }
    printf("\n");
  }
	return 0;
}