public class TestIterator {

    public static void main(String[] args) {
        RangeIterator itr = new RangeIterator(10, 20, 2, false);

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(itr.next());
    }
}
