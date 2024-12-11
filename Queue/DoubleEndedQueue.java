package Queue;
import java.util.*;

public class DoubleEndedQueue {
    public static void main(String[] args) {
        Deque<Integer>d=new LinkedList<>();
       d.addFirst(2);
       d.addFirst(1);
       d.addLast(3);
       d.addLast(4);
       d.removeFirst();
       d.removeLast();
       System.out.println(d);

    }
}
