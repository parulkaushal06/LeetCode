
class MyCircularQueue {
    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    public MyCircularQueue(int k) {
        arr = new int[k];
        capacity = k;
        size = 0;
        front = -1;
        rear = -1;
    }

    public boolean enQueue(int value) {
        if (size == capacity) {
            return false;
        }

        if (size == 0) {
            front = 0;
            rear = -1;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;

        return true;
    }

    public boolean deQueue() {
        if (size == 0) {
            return false;
        }

        if (size == 1) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;
        return true;
    }

    public int Front() {
        if (size == 0 || front == -1) {
            return -1;
        }
        return arr[front];
    }

    public int Rear() {
        if (size == 0 || rear == -1) {
            return -1;
        }
        return arr[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
