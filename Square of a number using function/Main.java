#include<stdio.h>
int main() {
   // Type your code here
  int n;
  scanf("%d",&n);
  int f=square(n);
  printf("%d",f);
   return 0;
}
int square(int n)
{
  return n*n;
}