package Repeat;

import java.util.Iterator;

public class ReverseRangeIterator implements Iterator<Integer> {
    private int start,end;

    public ReverseRangeIterator(int start, int end){
        this.start = start;
        this.end = end;
    }
    @Override
    public boolean hasNext() {
        return start<=end;
    }

    @Override
    public Integer next() {
        if (!hasNext()){
            return -1;
        }
        return end--;
    }
}
