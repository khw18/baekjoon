#include <iostream>

using namespace std;

int main(){
    int m, n, sum = 0, min = 10000;
    bool prime;
    cin >> m >> n;


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
        cout << sum << endl << min;
    else
        cout << -1;

}