/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  //Type your code here
  int n,sum1=0,sum2=0;
  scanf("%d",&n);
  int arr[n];
  int arr1[n];
  for(int i=0;i<n;i++){
    scanf("%d ",&arr[i]);
    arr1[i]=arr[i];
  }
  int max=arr[0];
  for(int i=0;i<n;i++)
  {
    if(max<arr[i])
    {
      int temp=max;
      max=arr[i];
      arr[i]=temp;
    }
  }
  for(int i=0;i<n;i++)
  {
    if(max==arr1[i])
      printf("%d",i);
  }
  return 0;
}