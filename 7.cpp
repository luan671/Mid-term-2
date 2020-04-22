#include <stdio.h>

int a = 3;
int b = 2;
int c = 1;
int main()
{
    if (a>b>c)
    printf("TRUE");
        else
        printf("FALSE");

    return 0;
}

//In math we should get a TURE since 3>2 and 2>1
//However in C/C++ after getting 3>2, the compiler returns a 1 for "true"
//then it becomes if 1>c. In our case 1 isn't greater than 1, so we get a 
//FALSE as output