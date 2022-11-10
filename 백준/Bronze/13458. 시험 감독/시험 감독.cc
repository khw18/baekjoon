#include <stdio.h>
#include <stdlib.h>

int main(){
    int n,b,c;
    int* a;
    long long cnt=0;
    scanf("%d", &n);
    a = (int*)(malloc(sizeof(int) * n));
//    int a[1000001];

    for(int i = 0; i < n; i++){
        scanf("%d", &a[i]);
    }
    scanf("%d %d", &b,&c);

    for(int i = 0; i < n; i++){
        a[i]-=b;
        cnt++;
        if(a[i] > 0){
            cnt += a[i]/c;
            if(a[i]%c > 0)
                cnt++;
        }
    }

    printf("%lld\n",cnt);
    free(a);
    return 0;
}