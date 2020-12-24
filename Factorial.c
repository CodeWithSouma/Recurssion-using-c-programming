// calculate the factorial of a number
#include <stdio.h>

int factorial(int number)
{
    if (number == 0)
        return 1;

    return number * factorial(number - 1);
}

void main()
{
    int number;
    printf("Enter a number: ");
    scanf("%d", &number);
    printf("Factrorial of %d : %d\n", number, factorial(number));
}