package Repeat;

//класс реализаует интерфейс IList для дженерика
//Т.к. класс подразумевает имплементацию не конкретного типа, а дженерика, то мы должны указать рядом с названием класса,
//что он будет принимать в себя другие типы
public class GenericListImpl<T> implements IList<T> {
    //В данном случае никакой реализации не будет, просто делаем Override методов
    //т.к. для интерфейсов всегда должна быть реализация всех внутренних методов
    @Override
    public boolean add(T value) {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public int indexOf(T value) {
        return 0;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
