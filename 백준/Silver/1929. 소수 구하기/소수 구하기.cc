#include <stdio.h>

int main(){
    int m, n;
    bool prime = true;
    scanf("%d%d", &m, &n);
    if(n==1)
        return 0;
    if(m==1)
        m++;
    for(int i = m; i <= n; i++){
        for(int j = 2; j*j <= i; j++){
            if(i%j==0){
                prime = false;
                break;
            }
        }
        if(prime)
            printf("%d\n", i);
        prime = true;
    }
}