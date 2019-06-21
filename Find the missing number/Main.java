#include<stdio.h>
int main()
{
  //Type your code here
  int n,flag=0;
  scanf("%d\n",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d\n",&arr[i]);
  int m=n;
  while(m>0)
  {
     for(int i=0;i<n;i++)
  	 { 
       if(arr[i]==m){
         flag=1;
         break;
       }
       else
         flag=0;
  	 }
    if(flag==0){
      printf("%d",m);
      break;
    }
    m--;
  }
  return 0;
}