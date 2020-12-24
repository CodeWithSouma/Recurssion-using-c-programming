// write a programming to print N odd number using recurssion
# include <stdio.h>

void printOddNumber(int number){
    if (number == 0)
    {
       return;
    }
    
    if (number % 2 != 0)
    {
       printf("%d\t", number);
    }
     printOddNumber(number - 1);
}

void main(){
    int number;
    printf("Enter number: ");
    scanf("%d",&number);
    printOddNumber(number);
    printf("\n");
}