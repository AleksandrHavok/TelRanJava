package Repeat;

//класс реализаует интерфейс IList для ссылочного типа Integer в качестве дженерика
public class IntegerListImpl implements IList<Integer>{
    //В данном случае никакой реализации не будет, просто делаем Override методов
    //т.к. для интерфейсов всегда должна быть реализация всех внутренних методов
    @Override
    public boolean add(Integer value) {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public int indexOf(Integer value) {
        return 0;
    }

    @Override
    public Integer get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
