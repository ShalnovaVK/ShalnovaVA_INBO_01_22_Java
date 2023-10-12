import java.util.Collection;

public interface IWaitList<E> {
   public void Add(E element);
   public E Remove();
   public boolean contains(E element);
   public boolean containsAll(Collection<E> c);
   public boolean isEmpty();
}
