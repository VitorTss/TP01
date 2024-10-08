#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

//verifica se a string é um palíndromo
bool ehpalindromo(char string[], int inicio, int fim) {

    if (inicio >= fim) {
        return true;
    }
    
    if (string[inicio] != string[fim]) {
        return false;
    }

    return ehpalindromo(string, inicio + 1, fim - 1);
}

int main() {
    char string[500];

    scanf(" %[^\n]", string);

    while (strcmp(string, "FIM") != 0) {
        if (ehpalindromo(string, 0, strlen(string) - 1)) {
            printf("SIM\n");
        } else {
            printf("NAO\n");
        }

        scanf(" %[^\n]", string);
    }

    return 0;
}
