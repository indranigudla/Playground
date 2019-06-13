  #include<stdio.h>

int main()
{

    int a, b, c;
    scanf("%d%d%d", &a, &b, &c); 
    if(a >= b && a >= c)
    {
        if(b >= c)
        {
          
            printf("second greatest = %d\n", b);
        }
        else
        {
            printf("second greatest = %d\n", c);
        }
    }
    else if(b >= a && b >= c)
    {
        if(a >= c)
        {
            printf("second gratest = %d\n",a);
        }
        else
        {
            printf("second greatest = %d\n",c);
        }
    }

    else if(a >= b)
    {
        printf("\nsecond greatest = %d\n", a);
    }
  else
    {
        printf("second greatest = %d\n", b);
    }

    return 0;
}