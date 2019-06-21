#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  int i=0;
  gets(str);
  char str1[26];
  for(i=0;i<26;i++)
    str1[i]=0;
  int j=0;
  while(str[j]!='\0')
  {
    if((str[j]>='a' && str[j]<='z'))
    {
 		int k=str[j]-'a';
    	str1[k]++;
    }
    j++;
  }
  int count=0;
  for(int k=0;k<26;k++)
  {
    if(str1[k]>=1){
      printf("%c%d ",'a'+k,str1[k]);
    }
  }
  return 0;
}