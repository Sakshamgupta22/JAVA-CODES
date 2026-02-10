#include <stdio.h>
int main() {
    int a,b;
    printf("Enter two numbers:\n ");
    scanf("%d",&a);
    scanf("%d",&b);
    if(b%a==0){
    printf("B is divides by A");
    }
    else{
        printf("A is not divides by B");
    }
    return 0;
}