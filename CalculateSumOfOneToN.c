// calculate  the sume of 1 to N using recurssion
# include<stdio.h>

int sum(int number){
    if (number == 0)
    {
        return 0;
    }
    
    return number + sum(number - 1);
}

void main(){
    int number;
    printf("Enter a number: ");
    scanf("%d",&number);

    //calculate sum
    int result = sum(number);
    printf("Sum of 1 to %d : %d ",number,result);
}

