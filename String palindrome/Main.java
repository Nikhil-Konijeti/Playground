#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char arr[100];
  int flag=0;
  gets(arr);
  int i=0;
  int l=strlen(arr);
  while(arr[i]!='\0')
  {
    if(arr[i]!=arr[l-1] && i>=l){
      flag=1;
      break;
    }
    i++;
    l--;
  }
  if(flag==1)
    printf("%s is not a palindrome",arr);
  else
    printf("%s is a palindrome",arr);
  return 0;
}