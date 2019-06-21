#include <stdio.h>
 
int main()
{
    int a,b,c,hcf,st;
	scanf("%d %d %d", &a,&b,&c);
 
 	st=a<b?(a<c?a:c):(b<c?b:c);
 
	 for (hcf=st;hcf>=1;hcf--)
 	{
  	  if (a%hcf==0 && b%hcf==0 && c%hcf==0)
  		 break;
 	} 
 
	printf("%d",hcf);
 
 return 0;
}
