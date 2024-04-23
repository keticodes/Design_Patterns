package Iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int current = 0;
    private int next = 1;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int response = current;
        int nextNumber = current + next;
        current = next;
        next = nextNumber;
        return response;
    }
}