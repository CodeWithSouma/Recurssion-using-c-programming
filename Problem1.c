// what is the output of this programme
# include <stdio.h>

int fun(int number){
    if(number == 0)
    {
        return 1;
    }
    return 7 + fun(number - 2);
}

void main(){
    printf("Output: %d\n", fun(4));
}