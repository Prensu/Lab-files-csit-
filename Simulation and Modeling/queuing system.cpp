#include <stdio.h>

#include <stdlib.h>

#define MAX SIZE 100

#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 100  // Corrected macro definition

// Structure definition for Queue
struct Queue {
    int items[MAX_SIZE];  // Array to store queue elements
    int front;             // Index of the front element
    int rear;              // Index of the rear element
};

// Function to create a queue
struct Queue* createQueue() {
    struct Queue* queue = (struct Queue*)malloc(sizeof(struct Queue));  // Memory allocation for the queue
    queue->front = -1;
    queue->rear = -1;
    return queue;
}

// Function to check if the queue is empty
int isEmpty(struct Queue* queue) {
    return queue->rear == -1;
}

// Function to check if the queue is full
int isFull(struct Queue* queue) {
    return queue->rear == MAX_SIZE - 1;
}

// Function to enqueue an element into the queue
void enqueue(struct Queue* queue, int value) {
    if (isFull(queue)) {
        printf("Queue is full, cannot enqueue!\n");
        return;
    }

    if (isEmpty(queue)) {
        queue->front = 0;  // If the queue is empty, set front to 0
    }

    queue->rear++;  // Increment rear
    queue->items[queue->rear] = value;  // Insert the item
}

// Function to dequeue an element from the queue
int dequeue(struct Queue* queue) {
    int item;

    if (isEmpty(queue)) {
        printf("Queue is empty, cannot dequeue!\n");
        return -1;
    }

    item = queue->items[queue->front];  // Get the front item
    queue->front++;  // Increment front

    if (queue->front > queue->rear) {  // Reset the queue if it's empty
        queue->front = queue->rear = -1;
    }

    return item;
}

// Function to calculate the average queue length
double averageQueueLength(struct Queue* queue, int totalTime) {
    if (isEmpty(queue)) {
        return 0.0;
    }

    return (double)(queue->rear - queue->front + 1) / totalTime;
}

// Function to calculate the average waiting time
double averageWaitingTime(struct Queue* queue, int totalTime) {
    if (isEmpty(queue)) {
        return 0.0;
    }

    int totalItems = queue->rear - queue->front + 1;  // Calculate the number of items in the queue
    return (double)totalItems / totalTime;
}

// Function to calculate the utilization of the queue
double utilization(struct Queue* queue, int totalTime) {
    if (isEmpty(queue)) {
        return 0.0;
    }

    return (double)totalTime / (queue->rear - queue->front + 1);  // Calculate utilization
}

int main() {
    struct Queue* queue = createQueue();  // Create a queue
    int totalTime = 20;  // Total time units

    // Enqueueing some items into the queue
    enqueue(queue, 10);
    enqueue(queue, 20);
    enqueue(queue, 30);

    // Dequeueing an item from the queue
    dequeue(queue);

    // Printing the calculated values
    printf("Average queue length: %.2f\n", averageQueueLength(queue, totalTime));
    printf("Average waiting time: %.2f\n", averageWaitingTime(queue, totalTime));
    printf("Utilization: %.2f\n", utilization(queue, totalTime));

    free(queue);  // Free the allocated memory for the queue

    return 0;
}

