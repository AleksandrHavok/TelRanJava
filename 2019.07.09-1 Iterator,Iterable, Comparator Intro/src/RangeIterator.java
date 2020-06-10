import java.util.Iterator;

public class RangeIterator implements Iterator <Integer> {

    public RangeIterator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    private int start, end;

    @Override
    public boolean hasNext() {
        return start<=end;
    }

    @Override
    public Integer next() {
        if(!hasNext()){
            return -1;
        }
        return start++;
    }
}
