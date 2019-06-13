 #include <stdio.h>
int main()
{
  int n;
	scanf("%d",&n);
	
	if(n==0)
		printf("%d",0);
	else if(n%9==0)
		printf("%d",9);
	else
		printf("%d",n%9);
	printf("\n");
	return 0;
}