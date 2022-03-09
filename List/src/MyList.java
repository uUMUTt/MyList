
public class MyList<T> {

    private int capacity;
    private T arr[];
    private int current;

    public MyList() {
        this.capacity = 10;
        this.arr = (T[]) new Object[capacity];
        this.current = 0;
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.arr = (T[]) new Object[capacity];
        this.current = 0;
    }

    public void add(T t) {
        if (this.current == this.arr.length) {
            this.duplicate();
        }
        this.arr[current] = t;
        current++;
    }

    public T get(int index) {
        if (index < this.current) {
            return this.arr[index];
        }
        return null;
    }

    public T set(int index, T data) {
        if (index < this.current) {
            this.arr[index] = data;
            return this.arr[index];
        }
        return null;
    }

    public T remove(int index) {
        if (index < this.current) {
            this.shiftLeft(index);
            current--;
            return this.arr[index];
        }
        return null;
    }

    public void shiftLeft(int index) {
        int i;
        for (i = index + 1; i < current; i++) {
            this.arr[i - 1] = arr[i];
        }
        arr[i - 1] = null;
    }

    public int size() {
        return this.current;
    }

    public boolean isEmpty() {
        return this.current == 0;
    }

    public T[] toArray() {
        T temp[] = (T[]) new Object[current];
        for (int i = 0; i < this.current; i++) {
            temp[i] = this.arr[i];
        }
        return temp;
    }

    private void duplicate() {
        T temp[] = this.arr;
        this.capacity *= 2;
        this.arr = (T[]) new Object[capacity];
        for (int i = 0; i < temp.length; i++) {
            this.arr[i] = temp[i];
        }
    }

    public MyList<T> sublist(int start, int finish) {
        MyList<T> list = new MyList<>();
        for (int i = start; i < finish + 1; i++) {
            list.add(this.arr[i]);
        }
        return list;
    }

    public boolean contains(T data) {
        return this.indexOf(data) != -1;
    }

    public int indexOf(T data) {
        for (int i = 0; i < current; i++) {
            if (this.arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = current - 1; i > -1; i--) {
            if (this.arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public void clear() {
        this.capacity = 10;
        this.arr = (T[]) new Object[this.capacity];
        this.current = 0;
    }

    @Override
    public String toString() {
        if (this.arr == null) {
            return "null";
        }

        int iMax = this.current - 1;
        if (iMax == -1) {
            return "[]";
        }

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0;; i++) {
            b.append(String.valueOf(this.arr[i]));
            if (i == iMax) {
                return b.append(']').toString();
            }
            b.append(", ");
        }
    }

}
