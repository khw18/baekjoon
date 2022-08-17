#include<stdio.h>

int main(){

    int n,i,j,T;
    int arr[10001] = {1,};

    for(i=2;i<=100;i++){
        for(j=i*i;j<=10000;j+=i) arr[j]++;
    }

    scanf("%d",&T);

    while(T--){
        scanf("%d",&n);
        for(i=j=n/2;;i++,j--){
            if(!arr[i]&&!arr[j]){
                printf("%d %d\n",j,i);
                break;
            }
        }
    }
}