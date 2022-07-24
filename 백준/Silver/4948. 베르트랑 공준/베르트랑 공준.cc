#include <cstdio>

int main() {
   int n = -1, sum = 0;
   bool prime = true;
   while(n){
       scanf("%d",&n);
       if(n==0){
           break;
       }

       for(int i = n+1; i <= 2*n; i++){
           for(int j = 2; j*j <= i; j++){
               if(i%j==0){
                   prime = false;
                   break;
               }
           }
           if(prime)
               sum++;

           prime = true;
       }
       printf("%d\n",sum);
       sum = 0;
   }
}