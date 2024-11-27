#include <stdio.h>
#include <conio.h>
#include <math.h>
#include <stdlib.h>
void intermediate_odd(long long, int);
int count_digit(long long, int);
int main()
{
    int a[20];                          /*to store the random numbers */
    long long seed, temp;               /*seed is the initaial number */
    int digit, n, i, j, count, divisor; /*to know the number of digit in the square obtained */
    printf("Mid-Square Method\n");
    printf("Enter a number to generate the random number: ");
    scanf("%lld", &seed);
    temp = seed;
    digit = 0;
    digit = count_digit(temp, digit);
    count = digit; /*the same digit is  to be used with 10 power to get reaminder */

    printf("\n How many random number you want to generate: ");
    scanf("%d", &n);

    printf("\nThe random numbers are:\n");
    for (i = 0; i < n; i++)
    {
        seed = seed * seed;
        temp = seed;
        digit = 0;
        digit = count_digit(temp, digit);
        digit = ceil(digit / 4.0);

        for (j = 0; j < digit; j++)
        {
            seed = seed / 10;
        }

        divisor = pow(10, count);
        seed = seed % divisor;
        a[i] = seed;
        printf("%lld\t", seed);
    }

    return 0;
}
int count_digit(long long seed, int digit) // to count the number of digit
{
    long long temp;
    temp = seed;
    while (temp != 0) /*digit count*/
    {
        temp = temp / 10;
        digit++;
    }
    return digit;
}
