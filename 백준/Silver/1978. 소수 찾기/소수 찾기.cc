#include <iostream>

using namespace std;

int main(){
    int n, num, cnt = 0;
    bool prime;
    cin >> n;

    while(n--){
        cin >> num;
        prime = true;
        for(int i = 2; i < num; i++){
            if(num%i==0){
                prime = false;
                break;
            }
        }
        if(prime && num != 1)
            cnt++;
    }

    cout << cnt;
}