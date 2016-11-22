/**
 * Created by root on 11/17/16.
 */
import java.util.*;

public class BlockingQueue<E> {
    //data
    private static final int LEN = 10;
    private List<E> queue = new ArrayList<E>(LEN);

    boolean add(E e) {
        if (queue.size() >= 10) {
            return false;
        }
        else {
            queue.add(e);
            return true;
        }
    }

    boolean remove() {
        if (queue.size() <= 0) {
            return false;
        }
        else {
            queue.remove(0);
            return true;
        }
    }

    E element() {
        if (queue.size() <= 0) {
            return null;
        }
        else {
            return queue.get(0);
        }
    }

    void print() {
        Iterator<E> iter = queue.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next().toString() + " ");
        }
        System.out.print("\n The End \n");
    }
}
