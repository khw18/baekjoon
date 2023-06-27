import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 연산의 개수 입력
        int N = Integer.parseInt(br.readLine());

        // 절댓값 힙을 위한 우선순위 큐 생성
        // 절댓값이 작은 순서로 정렬되며, 절댓값이 같은 경우 작은 수부터 출력됨
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            if (absA == absB) {
                return Integer.compare(a, b);
            }
            return Integer.compare(absA, absB);
        });

        StringBuilder sb = new StringBuilder();

        // 연산 수행
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x != 0) {
                // x가 0이 아닌 경우, x를 우선순위 큐에 추가
                heap.offer(x);
            } else {
                if (heap.isEmpty()) {
                    // 배열이 비어 있는 경우 0을 출력
                    sb.append(0).append('\n');
                } else {
                    // 절댓값이 가장 작은 값을 출력하고 제거
                    sb.append(heap.poll()).append('\n');
                }
            }
        }

        // 결과 출력
        System.out.print(sb);
    }
}
