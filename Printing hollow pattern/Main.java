#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
    for(int j=1;j<=n;j++)
      printf("*");
    printf("\n");
    for(int k=1;k<=((n/2)+1);k++){
    printf("*");
    for(int l=1;l<=((n/2)+1);l++)
      printf(" ");
    printf("*");
    printf("\n"); 
    }
    for(int m=1;m<=n;m++)
      printf("*");
	return 0;
}