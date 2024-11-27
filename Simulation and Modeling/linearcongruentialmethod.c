#include <stdio.h>
int main()
{
    printf("Linear Congruential Method\n");
    int x0, m, a, c, n,i;

    // Input values
    printf("Enter the number of random numbers to be generated: ");
    scanf("%d", &n);
    if (n <= 0) {
        printf("The number of random numbers must be positive.\n");
        return 1;
    }

    printf("Enter the initial seed value: ");
    scanf("%d", &x0);

    printf("Enter the modulo m: ");
    scanf("%d", &m);
    if (m <= 0) {
        printf("Modulo value must be positive.\n");
        return 1;
    }

    printf("Enter the value of a and c: ");
    scanf("%d%d", &a, &c);

    // Generating and displaying random numbers
    printf("Generated random numbers:\n");
    for (i = 1; i <= n; i++) {
        printf("%d\t", x0);
        x0 = (a * x0 + c) % m;
    }

    printf("\n");
    return 0;
}

