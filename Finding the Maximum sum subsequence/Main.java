int maxSumIS(int arr[], int n) 
{ 
  int i,j=1,sum=arr[0],k=0;
  int max[10];
    for(i=0;i<n;i++)
    {
      		if(arr[i]<=arr[j] && j<=n-1)
             {
               sum+=arr[j];
               j++;
             }
      		 else
             {
               sum=arr[j];
               j++;
             }
             max[k]=sum;
      	k++;
      
    }
  int max1=max[0];
  for(i=1;i<=k;i++)
  {
	if(max1<=max[i])
      max1=max[i];
  }
  return max1;
} 
  
int main() 
{ 
    int n;
    scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d ",&arr[i]);
    printf("%d",maxSumIS( arr, n ) ); 
    return 0; 
} 