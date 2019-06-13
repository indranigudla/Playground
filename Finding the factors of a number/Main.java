#include <stdio.h>
int main() 
{
	int n,f;
  scanf("%d",&n);
  for(f=1;f<=n;f++)
  {
    if(n%f==0)
    {
      printf("%d\n",f);
    }
  }
	return 0;
}