// write a programming to print N even number using recurssion
# include <stdio.h>

void printEvenNumber(int number){
    if (number == 0)
    {
       return;
    }
    
    if (number % 2 == 0)
    {
       printf("%d\t", number);
    }
     printEvenNumber(number - 1);
}

void main(){
    int number;
    printf("Enter number: ");
    scanf("%d",&number);
    printEvenNumber(number);
    printf("\n");
}