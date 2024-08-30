#include <stdio.h>
#include <stdlib.h>

int main() {
    int x;

    char *num = (char *)malloc(255 * sizeof(char));

    FILE *reais = fopen("reais.txt", "w");
    if (reais == NULL) {
        return 1;
    }

    scanf("%d", &x);

    for (int i = 0; i < x; i++) {
        scanf(" %[^\n]", num);
        fprintf(reais, "%s\n", num);  // Adiciona nova linha após cada entrada
    }

    fclose(reais);

    reais = fopen("reais.txt", "r");
    if (reais == NULL) {
        return 1;
    }

    fseek(reais, 0, SEEK_END);
    int tam = ftell(reais);
    
    for (int i = tam - 2; i >= 0; i--) {  
        fseek(reais, i, SEEK_SET);
        
        if (fgetc(reais) == '\n' || i == 0) {
            if (i != 0) fseek(reais, i + 1, SEEK_SET);  // Ajusta para a próxima linha
            fgets(num, 255, reais);
            printf("%s", num);
        }
    }

    fclose(reais);
    free(num);

    return 0;
}
