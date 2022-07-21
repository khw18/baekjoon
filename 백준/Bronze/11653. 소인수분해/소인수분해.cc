#include <cstdio>

int main() {
    int n;
    scanf("%d", &n);
    if (n != 1) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                n /= i;
                printf("%d\n", i);
                i = 1;
            }
        }
        printf("%d", n);
    }
}