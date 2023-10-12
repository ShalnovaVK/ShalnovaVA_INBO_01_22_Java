import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> all = new ArrayList<Integer>();
        all.add(1);
        all.add(3);
        all.add(5);
        all.add(7);
        all.add(9);
        WaitList wl = new WaitList(all);
        wl.Remove();
        wl.Add(5);
        System.out.println(wl.isEmpty());
        System.out.println(wl.contains(3));
        System.out.println(wl.containsAll(all));
        System.out.println(wl.toString());

        BoundedWaitList bl = new BoundedWaitList(20, all);
        bl.Remove();
        bl.add(5);
        System.out.println(bl.isEmpty());
        System.out.println(bl.contains(3));
        System.out.println(bl.containsAll(all));
        System.out.println(bl.toString());
        UnFairWaitList ul = new UnFairWaitList(all);
        ul.Remove();
        ul.Remove(7);
        ul.moveToBack(11);
        ul.Add(5);
        System.out.println(ul.isEmpty());
        System.out.println(ul.contains(3));
        System.out.println(ul.containsAll(all));
        System.out.println(ul.toString());
    }
}