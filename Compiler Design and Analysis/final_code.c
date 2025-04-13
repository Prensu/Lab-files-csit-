#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char op[2], arg1[10], arg2[10], result[10];

int main() {
    FILE *fp1;

    fp1 = fopen("input.txt", "r");
    if (fp1 == NULL) {
        printf("Error: Could not open input.txt\n");
        return 1;
    }

    printf("Assembly Instructions:\n\n");

    while (fscanf(fp1, "%s %s %s %s", op, arg1, arg2, result) == 4) {
        if (strcmp(op, "+") == 0) {
            printf("MOV R0, %s\n", arg1);
            printf("ADD R0, %s\n", arg2);
            printf("MOV %s, R0\n", result);
        } else if (strcmp(op, "*") == 0) {
            printf("MOV R0, %s\n", arg1);
            printf("MUL R0, %s\n", arg2);
            printf("MOV %s, R0\n", result);
        } else if (strcmp(op, "-") == 0) {
            printf("MOV R0, %s\n", arg1);
            printf("SUB R0, %s\n", arg2);
            printf("MOV %s, R0\n", result);
        } else if (strcmp(op, "/") == 0) {
            printf("MOV R0, %s\n", arg1);
            printf("DIV R0, %s\n", arg2);
            printf("MOV %s, R0\n", result);
        } else if (strcmp(op, "=") == 0) {
            printf("MOV R0, %s\n", arg1);
            printf("MOV %s, R0\n", result);
        } else {
            printf("; Unknown operator: %s\n", op);
        }
    }

    fclose(fp1);

    // Optional: Pause before closing (for Windows)
    printf("\nPress Enter to exit...");
    getchar(); // consumes leftover newline
    getchar(); // waits for user input
    return 0;
}

