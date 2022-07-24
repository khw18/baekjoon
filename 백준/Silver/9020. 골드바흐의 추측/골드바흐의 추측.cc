#include <cstdio>
#include <cstdlib>

int main(){
    int t, n, temp_a, temp_b, a, b, dist;
    bool prime = true;


    scanf("%d",&t);
    while(t--){
        scanf("%d", &n);
        dist = n;
        for(int i = 2; i < n-1; i++){
            for(int j = 2; j*j <= i; j++){
                if(i%j==0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                temp_a = i;
                temp_b = n-temp_a;
                for(int j = 2; j*j <= temp_b; j++){
                    if(temp_b%j==0){
                        prime = false;
                        break;
                    }
                }
                if(prime){
                    if(dist > abs(temp_a-temp_b)){
                        dist = abs(temp_a-temp_b);
                        a = temp_a;
                        b = temp_b;
                    }
                }
            }
            prime = true;
        }
        printf("%d %d\n", a, b);
    }

}