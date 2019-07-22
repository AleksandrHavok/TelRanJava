public class TestIterator {

    public static void main(String[] args) {
        RageIterator itr = new RageIterator(10, 20, 2, false);

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(itr.next());
    }
}
