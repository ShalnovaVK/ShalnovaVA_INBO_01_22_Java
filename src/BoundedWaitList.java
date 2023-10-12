import java.util.Collection;

public class BoundedWaitList<E> extends WaitList{
    private int capacity;

    public int getCapacity() {
        return capacity;
    }
    public  BoundedWaitList(int capacity, Collection<E> c){
        super(c);
        this.capacity = capacity;
    }
    public void add(E element) {
        content.add(element);
    }
    @Override
    public String toString() {
        return "BoundedWaitList( content= " + content + ", capacity= "+capacity+")";
    }

}
