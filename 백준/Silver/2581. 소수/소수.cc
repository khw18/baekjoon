#include <stdio.h>


int main(){
    int m, n, sum = 0, min = 10000;
    bool prime;
    scanf("%d %d",&m,&n);


    for(int i = m; i <= n; i++){
        prime = true;
        for(int j = 2; j < i; j++){
            if(i%j==0) {
                prime = false;
                break;
            }
        }
        if(prime && i != 1){
           sum += i;
           if(min > i)
               min = i;
        }
    }
    if(sum)
        printf("%d\n%d",sum,min);
    else
        printf("-1");

}