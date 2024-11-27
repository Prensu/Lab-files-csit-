#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void sort(float arr[], int n)
{
    int i, j;
    float temp;
    for (i = 0; i < n - 1; i++)
    {
        for (j = 0; j < n - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

float max(float a, float b)
{
    return (a > b) ? a : b;
}

int main()
{
    int n, i;
    float D_plus, D_minus, D, D_alpha = 0.565; // Example critical value for alpha = 0.05 and n = 10
    printf("Its pRENSU ! KS-test\n");
    printf("Enter the number of random numbers: ");
    scanf("%d", &n);

    float numbers[n];
    printf("Enter the random numbers:\n");
    for (i = 0; i < n; i++)
    {
        scanf("%f", &numbers[i]);
    }

    sort(numbers, n);

    float D_plus_max = 0.0, D_minus_max = 0.0;
    for (i = 0; i < n; i++)
    {
        float D_plus = ((float)(i + 1) / n) - numbers[i];
        float D_minus = numbers[i] - ((float)i / n);
        D_plus_max = max(D_plus_max, D_plus);
        D_minus_max = max(D_minus_max, D_minus);
    }

    D = max(D_plus_max, D_minus_max);
    printf("D+ max: %.3f\n", D_plus_max);
    printf("D- max: %.3f\n", D_minus_max);
    printf("D = max(D+ max, D- max) = %.3f\n", D);

    if (D > D_alpha)
    {
        printf("Reject the null hypothesis. The numbers are not uniformly distributed.\n");
    }
    else
    {
        printf("Since %.3f < %.3f, accept the null hypothesis. The numbers are uniformly distributed.\n",D,D_alpha);
    }

    return 0;
}
