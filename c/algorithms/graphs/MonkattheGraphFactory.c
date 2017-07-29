#include<stdio.h>
int main(void){
    int n, d, sum=0;
    scanf("%d",&n);
    while(n--){
        scanf("%d",&d);
        sum+=d;
    }
    if(sum/2==n-1){
        printf("Y\n");
    }else{
        printf("N\n");
    }
    return 0;
}