import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList <E> implements IWaitList<E> {
    // Поле content типа ConcurrentLinkedQueue. Функционал: хранение информации.
    protected ConcurrentLinkedQueue<E> content;

    //Конструктор без параметров. Функционал: создание объекта класса Е, передача параметров
    public WaitList(){
        content = new ConcurrentLinkedQueue<>();
    }

    //Конструктор с параметрами. Функционал: создание объекта класса Е, передача параметров
    public WaitList(Collection<E> c){
        content = new ConcurrentLinkedQueue<>(c);
    }

    //Переопределённый метод  toString(), возвращающий значение поля в виде строки
    @Override
    public String toString() {
        return "WaitList( content= " + content + ")";
    }

    //Метод добавляет параметр element в конец очереди
    @Override
    public void Add(E element) {
        content.add(element);
    }

    //Метод удаляет первый элемент очереди и возвращает его значение
    @Override
    public E Remove() {
        if(isEmpty()) System.out.println("Элементов нет!");
        return content.remove();
    }

    //Метод проверяет, есть ли данный элемент в очереди
    @Override
    public boolean contains(E element) {
        boolean res = false;
        for(int i = 0; i < content.size(); i++){
            E locelem = content.remove();
            if(locelem.equals(element)) res = true;
            content.add(locelem);
        }
        return res;
    }

    //Метод проверяет, все ли элементы в очереди совпадают с переданными в качестве параметров
    @Override
    public boolean containsAll(Collection<E> c) {
        ArrayList<E> all = new ArrayList<>(c);
        for(int i = 0; i < c.size(); i++){
            boolean res = false;
            for(int j = 0; j < content.size(); j++){
                E locelem = content.remove();
                if(locelem.equals(all.get(i))) res = true;
                content.add(locelem);
            }
            if(!res) return false;
        }
        return true;
    }

    //Метод проверяет, пустая ли очередь
    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
