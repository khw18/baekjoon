#include <cstdio>

int main() {
    int n, m, i = 0;
    scanf("%d %d", &n, &m);
    int arr[n];
    while (n--) {
        scanf("%d", &arr[i++]);
    }

    int size = sizeof(arr)/sizeof(int);

    int sum = arr[0] + arr[1] + arr[2], gap = 300000;
    for (int i = 0; i < size - 2; i++) {
        for (int j = i+1; j < size - 1; j++) {
            for (int k = j+1; k < size; k++) {
                if(arr[i] + arr[j] + arr[k] <= m) {
                    sum = arr[i] + arr[j] + arr[k];
                    if(m - sum < gap) { //현재 gap이 이전 gap보다 작다면
                        gap = m - sum;
                    }
                }
            }
        }
    }
    printf("%d", m-gap);

    return 0;
}
