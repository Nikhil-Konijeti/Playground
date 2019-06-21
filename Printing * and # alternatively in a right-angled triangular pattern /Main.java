#include <stdio.h>
int main(){
	// Type your code here
  int n,l=0;
  scanf("%d",&n);
  int num=0,s=2;
  printf("*");
  printf("\n");
  for(int i=2;i<=n;i++)
  {
   for(int j=1;j<=i;j++)
   {
     if(num==s || num==s+1){
     if(j%2==1)
       printf("*");
     else
       printf("#");
     if(num==s+1 && j==i)
       num=0;
     }
     else{
       if(j%2==1)
        printf("#");
       else
        printf("*");
     }
     
   }
    	num++;
    printf("\n");
  }
  	return 0;
}