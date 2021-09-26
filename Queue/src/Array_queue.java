public class Array_queue {
    private int max; //큐 용량
    private int num; //현재 데이터 수
    private int[] que; //큐 본체

    public Array_queue(int capacity) {
        num = 0;
        max = capacity;
        try {
            que = new int[max];         // 큐 본체용 배열을 생성
        } catch (OutOfMemoryError e) {   // 생성할 수 없습니다.
            max = 0;
        }
    }

    public int enque(int x) {
        que[num++] = x;
        return x;
    }

    public int deque(int x) {
        x = que[0];
        for (int i = 0; i < num - 1; i++)
            que[i] = que[i + 1];
        num--;
        return x;
    }

    public void dump() {
        for (int i = 0; i < num; i++)
            System.out.println(que[i] + " ");
    }
}
