import java.util.Collection;

public class UnFairWaitList<E> extends WaitList{
    public UnFairWaitList(Collection<E> c){
        super(c);
    }
    public void Remove(E element){
        boolean res = false;
        for(int i = 0; i < content.size(); i++){
            E locelem = (E) content.remove();
            if(locelem.equals(element)) content.remove();
            content.add(locelem);
        }
    }
    public void moveToBack(E element){
        content.add(element);
    }
}
