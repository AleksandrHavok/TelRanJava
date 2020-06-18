import java.util.Iterator;

public class DoubleRangeIterator implements Iterator<Double> {

    private double start,end,step=0.5;

    public DoubleRangeIterator(double start, double end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean hasNext() {
        return start<=end;
    }

    @Override
    public Double next() {
        if (!hasNext()){
            return  -1.0;
        }
        double res=start;
        start+=step;
        return res;
    }
}
