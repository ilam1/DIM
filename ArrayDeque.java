//Team DIM(Sum)

/*****************************************************
 * class ArrayDeque
 * Implements Deque as specified in local Deque.java
 * Generically typed
 * Uses an ArrayList as underlying container
 *****************************************************/
import java.util.*;
public class ArrayDeque<T> implements Deque<T> {
    private ArrayList<T> _deque = new ArrayList<T>();

    public int size() {
	return _deque.size();
    }

    public void addLast(T e) {
	_deque.add(e);
    }

    public void addFirst(T e) {
	_deque.add(0, e);
    }

    public T peekFirst() {
	return _deque.get(0);
    }

    public T peekLast() {
	return _deque.get(size()-1);
    }

    public boolean contains(Object o) {
	return _deque.contains(o);
    }

    public T remove() {
	return _deque.remove(size()-1);
    }

    public T removeFirst() {
	return _deque.remove(0);
    }

    public boolean remove(Object o) {
	return _deque.remove(o);
    }

    public String toString() {
	String ans = "";
	for (T each : _deque) 
	    ans += " " + each;
	return ans;
    }

    public static void main(String[] args) {
	Deque<String> table = new ArrayDeque<>();
	table.addLast("porkBun");
	table.addFirst("shrimpDumpling");
	table.addLast("chopsticks");
	table.addLast("tea");
	table.addFirst("pudding");

	System.out.println("table toString: " + table);
	System.out.println("Testing contains pudding: " + table.contains("pudding"));
	System.out.println("Peek first: " + table.peekFirst());
	System.out.println("Removing first: " + table.removeFirst());
	System.out.println("Testing contains pudding: " + table.contains("pudding"));	
    }		   
}
