package objectorientd.dynamicArray;

public class MyArray {
    private int[] data;
    private int currentSize;
    private int capacity;

    public MyArray() {
        capacity = 10;
        data = new int[capacity];
        currentSize = 0;
    }

    public void add(int element) {
        if (currentSize == capacity) {
            resize();
        }
        data[currentSize++] = element;
    }

    public int get(int index) {
        if (index < 0 || index >= currentSize) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return data[index];
    }

    public int size() {
        return currentSize;
    }

    private void resize() {
        capacity *= 2;
        int[] newData = new int[capacity];
        for (int i = 0; i < currentSize; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}
