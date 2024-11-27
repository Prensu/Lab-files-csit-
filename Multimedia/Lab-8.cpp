#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct node {
    char ch;
    int freq;
    struct node *left;
    struct node *right;
} node;

node *heap[100];
int heapSize = 0;

void Insert(node *element) {
    heapSize++;
    heap[heapSize] = element;
    int now = heapSize;
    while (now > 1 && heap[now / 2]->freq > element->freq) {
        heap[now] = heap[now / 2];
        now /= 2;
    }
    heap[now] = element;
}

node *DeleteMin() {
    node *minElement = heap[1];
    node *lastElement = heap[heapSize--];
    int now, child;
    for (now = 1; now * 2 <= heapSize; now = child) {
        child = now * 2;
        if (child != heapSize && heap[child + 1]->freq < heap[child]->freq) {
            child++;
        }
        if (lastElement->freq > heap[child]->freq) {
            heap[now] = heap[child];
        } else {
            break;
        }
    }
    heap[now] = lastElement;
    return minElement;
}

void print(node *temp, char *code) {
    if (temp->left == NULL && temp->right == NULL) {
        printf("char %c code %s\n", temp->ch, code);
        return;
    }
    int length = strlen(code);
    char leftcode[100], rightcode[100];
    strcpy(leftcode, code);
    strcpy(rightcode, code);
    leftcode[length] = '0';
    leftcode[length + 1] = '\0';
    rightcode[length] = '1';
    rightcode[length + 1] = '\0';
    print(temp->left, leftcode);
    print(temp->right, rightcode);
}

void freeTree(node *root) {
    if (root == NULL) {
        return;
    }
    freeTree(root->left);
    freeTree(root->right);
    free(root);
}

int main() {
    heap[0] = (node *)malloc(sizeof(node));
    heap[0]->freq = -1; // Set to a very small value for proper comparison
    int n;
    printf("Enter the number of characters: ");
    scanf("%d", &n);

    if (n == 0) {
        printf("No characters provided.\n");
        return 0;
    }

    printf("Enter the characters and their frequencies:\n");
    char ch;
    int freq;
    for (int i = 0; i < n; i++) {
        scanf(" %c %d", &ch, &freq);
        node *temp = (node *)malloc(sizeof(node));
        temp->ch = ch;
        temp->freq = freq;
        temp->left = temp->right = NULL;
        Insert(temp);
    }

    if (n == 1) {
        printf("char %c code 0\n", heap[1]->ch);
        free(heap[1]);
        free(heap[0]);
        return 0;
    }

    for (int i = 0; i < n - 1; i++) {
        node *left = DeleteMin();
        node *right = DeleteMin();
        node *temp = (node *)malloc(sizeof(node));
        temp->ch = 0;
        temp->freq = left->freq + right->freq;
        temp->left = left;
        temp->right = right;
        Insert(temp);
    }

    node *tree = DeleteMin();
    char code[100] = "";
    print(tree, code);

    // Free allocated memory
    freeTree(tree);
    free(heap[0]);

    return 0;
}

