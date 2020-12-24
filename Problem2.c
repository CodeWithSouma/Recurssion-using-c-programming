// WAP to print numbers from 1 to N in such a way that when number is odd, add 1 and 
//when number is even subtract 1 using indirect recurssion
# include<stdio.h>

int number = 1;
int range;

void printEven(void);
void printOdd(void);

void printEven(){
    if (number <= range)
    {
        printf("%d\t",number-1);
        number++;
        printOdd();
    }

    return;    
}


void printOdd(){
    if (number <= range)
    {
        printf("%d\t",number+1);
        number++;
        printEven();
    }
    return;
}


void main(){
    printf("Enter range: ");
    scanf("%d",&range);
    printOdd();
    printEven();
    printf("\n");
}
