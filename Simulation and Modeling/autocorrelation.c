#include <stdio.h>
#include <math.h>
int i;
// Function to calculate the mean of a dataset
float calculateMean(float data[], int n) {
    float sum = 0.0f;
    for (i = 0; i < n; ++i) {
        sum += data[i];
    }
    return sum / n;
}

// Function to calculate autocorrelation for a given lag
float calculateAutocorrelation(float data[], int n, int lag) {
    float mean = calculateMean(data, n);

    float numerator = 0.0f;
    float denominator = 0.0f;
    int i;
    // Calculate the numerator and denominator
    for (i = 0; i < n; ++i) {
        denominator += (data[i] - mean) * (data[i] - mean);
        if (i + lag < n) {
            numerator += (data[i] - mean) * (data[i + lag] - mean);
        }
    }

    return numerator / denominator;
}

int main() {
    int n, lag;

    // Input data
    printf("Auto-Correlation Test\n");
    printf("Enter the number of data points: ");
    scanf("%d", &n);

    if (n <= 0) {
        printf("Number of data points must be positive.\n");
        return 1;
    }

    float data[n];
    int i;
    printf("Enter %d data points: ", n);
    for (i = 0; i < n; ++i) {
        scanf("%f", &data[i]);
    }

    // Input lag
    printf("Enter the lag: ");
    scanf("%d", &lag);

    if (lag < 0 || lag >= n) {
        printf("Invalid lag value. Lag must be between 0 and %d.\n", n - 1);
        return 1;
    }

    // Calculate and display autocorrelation
    float autocorrelation = calculateAutocorrelation(data, n, lag);
    printf("Autocorrelation for lag %d: %.4f\n", lag, autocorrelation);

    return 0;
}

