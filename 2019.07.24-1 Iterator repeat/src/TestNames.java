import java.util.Iterator;

public class TestNames {

    public static void main(String[] args) {
        NamesList list = new NamesList();
        list.add("Vasya");
        list.add("Petya");


        String[] array = list.getAll();
//		for(int i = 0; i < array.length; i++) {
//			if(array[i] != null) {
//				System.out.println(array[i]);
//			}
//			
//		}
        array[0] = "Loser";
        array[1] = "Loser";
        for(int i = 0; i < list.size(); i++) {
            System.out.println(array[i]);
        }

        array = list.getAll();
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("===============");
//		NamesList.NamesIterator iterator = list.iterator();
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//		System.out.println("==============");
//		for(String str : list) {
//			System.out.println(str);
//		}
        Iterable<String> itr = new NamesList();
        for(String str : itr) {
            System.out.println(str);
        }
    }

}