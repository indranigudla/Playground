#include<stdio.h>
int main()
{
  int a=6,b=9,area,perimeter;
  perimeter= 2*(a+b);
  area= a*b;
  printf("The perimeter of the rectangle is: %d cm\nThe area of the rectangle is: %d sq cm", perimeter,area);
  return 0;
}