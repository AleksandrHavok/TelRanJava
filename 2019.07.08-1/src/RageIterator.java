public class RageIterator {
    private int start;
    private int end;
    private int step;
    private boolean reverse;


    public RageIterator(int start,int end,int step,boolean reverse){
        this.start =start;
        this.end=end;
        this.step=step;
        this.reverse=reverse;
    }
    public boolean hasNext(){
        return end >= start;
    }
    public int next(){
        if (!hasNext()){
            return -1;
        }
        int res;
        if (reverse){
            res=end;
            end-=step;
            return res;
        }else {
            res=start;
            start+=step;
        }
        return res;
    }
}
