#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
    char s[100];
    int state = 0, i = 0;
    char c;

    printf("Enter a string: ");
    scanf("%s", s); // safer than gets()

    while (s[i] != '\0') {
        c = s[i++];
        switch (state) {
            case 0:
                if (c == 'a') state = 1;
                else if (c == 'b') state = 2;
                else state = 6;
                break;

            case 1:
                if (c == 'a') state = 3;
                else if (c == 'b') state = 4;
                else state = 6;
                break;

            case 2:
                if (c == 'b') state = 2;
                else state = 6;
                break;

            case 3:
                if (c == 'a') state = 3;
                else if (c == 'b') state = 2;
                else state = 6;
                break;

            case 4:
                if (c == 'b') state = 5;
                else state = 6;
                break;

            case 5:
                if (c == 'b') state = 2;
                else state = 6;
                break;

            case 6:
                printf("\n%s is not recognized\n", s);
                return 0;
        }
    }

    // Final state decision
    if (state == 1 || state == 3)
        printf("\n%s is accepted under rule 'a*'\n", s);
    else if (state == 2 || state == 4)
        printf("\n%s is accepted under rule 'a*b+'\n", s);
    else if (state == 5)
        printf("\n%s is accepted under rule 'abb'\n", s);
    else
        printf("\n%s is not recognized\n", s);

    return 0;
}

