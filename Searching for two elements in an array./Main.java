#include<stdio.h>
int main()
{
  //Type your code here
  int n,k,l,f=0,fl=0;
  scanf("%d\n",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d ",&arr[i]);
  }
  scanf("%d\n",&k);
  scanf("%d\n",&l);
  for(int i=0;i<n;i++)
  {
    if(k==arr[i])
    {
      f=1;
      printf("%d\n",i);
      break;
    }
    else
    {
		f=-1;
        fl=-1;
    }
  }
  for(int i=0;i<n;i++)
  {
    if(l==arr[i])
    {
      fl=1;
      printf("%d\n",i);
      break;
    }
  }
  if(f==-1)
  printf("%d\n",f);
  else if(fl==-1)
  printf("%d\n",fl);
  return 0;
}