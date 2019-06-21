#include<stdio.h>
int main()
{
//Try out your code here
  char str[100];
  int j=0,y;
  scanf("%s",str);
  int arr[26];
  int i=0;
 while(i<26)
 {
   arr[i]=0;
   i++;
 }
  i=0;
  while(str[j]!='\0')
  {
    y=str[j]-'a';
    arr[y]=arr[y]+1;
    j++;
  }
  j=0;
  int flag=0;
  while(str[j]!='\0')
  {
    if(arr[str[j]-'a']==1){
      printf("%c",str[j]);
      flag=1;
      break;
    }
    j++;
  }
  if(flag==0)
    printf("All the characters are repetitive");
return 0;
}
