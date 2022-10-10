class MyCircularQueue {
    int arr[];
    int front, back, size;
    public MyCircularQueue(int k) {
        arr = new int[k];
        Arrays.fill(arr, -1);
        front = 0;
        back = 0;
        size = k;
    }
    
    public boolean enQueue(int value) {
        if (arr[back % size] != -1) return false;
        else arr[back++ % size] = value;
        return true;
    }
    
    public boolean deQueue() {
        if (arr[front % size] == -1) return false;
        else arr[front++ % size] = -1;
        return true;
    }
    
    public int Front() {
        return arr[front % size];
    }
    
    public int Rear() {
        if (back == 0) back = size;
        return arr[((back - 1) % size)];
    }
    
    public boolean isEmpty() {
        if (arr[front % size] == -1) return true;
        else return false;
    }
    
    public boolean isFull() {
        if (arr[back % size] != -1) return true;
        else return false;
    }
}
