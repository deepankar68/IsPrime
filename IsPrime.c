#include <stdio.h>

int main() {
    int t, i; // Declare loop variable i outside the for loop
    printf("How many nums you want to take: ");
    scanf("%d", &t);

    printf("Enter nums separated by white space: ");
    for (i = 0; i < t; i++) {
        int n, div, count = 0; // Declare variables
        scanf("%d", &n);

        for (div = 1; div <= n; div++) {
            if (n % div == 0) {
                count++;
            }
        }

        if (count == 2) {
            printf("Prime\n");
        } else {
            printf("Not Prime\n");
        }
    }

    return 0;
}

