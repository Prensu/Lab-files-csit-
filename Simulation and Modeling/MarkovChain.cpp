#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define STATES 2

// Function to generate the next state
int nextState(int currentState, double transitionMatrix[STATES][STATES])
{
    double randValue = (double)rand() / RAND_MAX;
    double cumulativeProbability = 0.0;

    for (int i = 0; i < STATES; i++)
    {
        cumulativeProbability += transitionMatrix[currentState][i];
        if (randValue < cumulativeProbability)
        {
            return i;
        }
    }
    return currentState; // Fallback in case of rounding errors
}

int main()
{
    srand(time(NULL));

    // Define the transition matrix
    double transitionMatrix[STATES][STATES] = {
        {0.6, 0.4}, // Probabilities from state 0 to states 0 and 1
        {0.2, 0.8}  // Probabilities from state 1 to states 0 and 1
    };
    printf("Markov Chain\n");
    int currentState, steps;
    printf("Enter the initial state: ");
    scanf("%d", &currentState);

    printf("Enter the number of steps: ");
    scanf("%d", &steps);

    for (int i = 0; i < steps; i++)
    {
        currentState = nextState(currentState, transitionMatrix);
        printf("Step %d: State %d\n", i + 1, currentState);
    }

    return 0;
}
