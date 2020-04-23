#include <stdio.h>

int fun(int *k) {
*k += 4;
return 3 * (*k) - 1;
}
int main() {
        int i = 10, j = 10, sum1, sum2;
    sum1 = (i / 2) + fun(&i);
    sum2 = fun(&j) + (j / 2);
printf ("sum1= %d\n", sum1);
printf ("sum2= %d", sum2);

return 0;
}

//sum1= 46 = 5 + fun(&1) = 5+(10+4)*3-1 = 5+41 = 46; since when entering the loop the space allocated to i is still 10 so i/2=5 works
//sum2= 48; fun(&j)=41, but now the position that allocates j is replaced by the pointer pointed to *k, which already became 10+4=14 when processing fun(&j)
//so fun(&j)+(j/2)=41+14/2=41+7=48