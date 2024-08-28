#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

bool ehpalindromo(char string[])
{

    bool flag = true;

    int i = 0, j = strlen(string) - 1;

    while (i <= j)
    {
        if (string[i] != string[j])
        {
            flag = false;
            i = j;
        }
        else
        {
            i++;
            j--;
        }
    }

    return flag;
}

int main()
{

    char string[500];

    scanf(" %[^\n]", string);

    while(strcmp(string , "FIM") != 0){
        if(ehpalindromo(string)){
            printf("SIM\n");
        }else{
            printf("NAO\n");
        }

        scanf(" %[^\n]", string);
    }

    return 0;
}