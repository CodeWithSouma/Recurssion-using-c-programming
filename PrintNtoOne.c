# include<stdio.h>

void print(int number){
    if (number == 0)
    {
        return;
    }
    
    printf("%d\t",number);
    print(number - 1);
}

void main(){
    // create a function that take an integer and print that integer to 1
    int number;
    printf("Enter a number: ");
    scanf("%d",&number);
    print(number);
    printf("\n");
}