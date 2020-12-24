// write a programme to print 1 to N natural number using none tail recurssion
#include<stdio.h>

void print(int range){
    if (range == 0)
    {
        return;
    }

    print(range - 1);
    printf("%d\t",range);
}

void main(){
    int range;
    printf("Enter a range: ");
    scanf("%d",&range);
    print(range);
    printf("\n");
}


