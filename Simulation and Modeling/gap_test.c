#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define MAX_NUM 100   // Maximum number for random number generation
#define N 20          // Number of random numbers to generate

// Function to perform the Gap Test
void gapTest(int numbers[], int size) {
    int gapCount = 0;
    int threshold = 10; // Minimum gap size to consider for gap test
    int i;
    // Count gaps that are greater than the threshold
    for (i = 1; i < size; i++) {
        if (numbers[i] - numbers[i-1] >= threshold) {
            gapCount++;
        }
    }

    // Print the result of the gap test
    printf("Total numbers: %d\n", size);
    printf("Numbers with gaps of at least %d: %d\n", threshold, gapCount);
    printf("Percentage of numbers with a gap of at least %d: %.2f%%\n", 
           threshold, (double)gapCount / (size - 1) * 100);
}

int main() {
    // Initialize random seed
    srand(time(0));

    int numbers[N],i;

    // Generate N random numbers between 0 and MAX_NUM
    for (i = 0; i < N; i++) {
        numbers[i] = rand() % MAX_NUM;
    }

    // Print the generated random numbers
    printf("Gap-test\n");
    printf("Generated numbers for gap-test: ");
    for (i = 0; i < N; i++) {
        printf("%d ", numbers[i]);
    }
    printf("\n");

    // Perform the gap test
    gapTest(numbers, N);

    return 0;
}

