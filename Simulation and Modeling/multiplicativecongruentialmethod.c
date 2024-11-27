#include <stdio.h>
int main()
{
    int x0, m, a, c, n,i;
    printf("MultiplicAtive Congruential Method\n");
    printf("Enter the number of random numbers to be generated: ");
    scanf("%d", &n);
    printf("Enter the initial seed value: ");
    scanf("%d", &x0);
    printf("Enter the modulo m: ");
    scanf("%d", &m);
    printf("Enter the value of a: ");
    scanf("%d", &a);
    for (i = 0; i < n; i++)
    {
        printf("%d\t", x0);
        x0 = (x0 * a) % m;
    }
    return 0;
}
