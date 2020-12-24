// calculate  the sume of 1 to N using recurssion
# include<stdio.h>

int sum(int number){
    if (number == 1)
    {
        return 1;
    }
    
    return number + sum(number - 1);// at last return the value to caller
}

void main(){
    int number;
    printf("Enter a number: ");
    scanf("%d",&number);

    //calculate sum
    int result = sum(number);
    printf("Sum of 1 to %d : %d \n",number,result);
}

