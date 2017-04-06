//Team DIM(Sum)

/*****************************************************
 * class ArrayDeque
 * Implements Deque as specified in local Deque.java
 * Generically typed
 * Uses an ArrayList as underlying container
 *****************************************************/
import java.util.*;
public class ArrayDeque<T> implements Deque<T> {
    private ArrayList<T> _deque;

    //Default Constructor	
    public ArrayDeque() {	
	_deque = new ArrayList<T>();
    }
	
    /**Determines the size of deque
     * Precondition: Deque is initialized
     * Postcondition: Returns the length of deque*/	
    public int size() {
	return _deque.size();
    }
	
    /**Inserts parameter e of type T to the end of the deque
     * Precondition: Deque is initialized
     * Postcondition: e is added to the end of deque */
    public void addLast(T e) {
	_deque.add(e);
    }
	
    /**Inserts parameter e of type T to the beginning of the deque
     * Precondition: Deque is initialized
     * Postcondition: e is added to the beginning of deque */
    public void addFirst(T e) {
	_deque.add(0, e);
    }
	
    /**Retrieves the first element of deque
     * Precondition: Deque is initialized
     * Postcondition: Returns the first element of deque if !isEmpty, otherwise returns null */
    public T peekFirst() {
	if (size() == 0) return null;	
	return _deque.get(0);
    }

    /**Retrieves the last element of deque
     * Precondition: Deque is initialized
     * Postcondition: Returns the last element of deque if !isEmpty, otherwise returns null */	
    public T peekLast() {
	if (size() == 0) return null;
	return _deque.get(size()-1);
    }

    /**Determines whether parameter e is contained in deque
     * Precondition: Deque is initialized
     * Postcondition: Returns true if parameter e is in deque, false otherwise*/
    public boolean contains(Object o) {	
	return _deque.contains(o);
    }

    /**Removes the last element of deque
     * Precondition: Deque is initialized
     * Postcondition: Returns the last element of deque if !isEmpty, otherwise returns null*/
    public T remove() {
	if (size() == 0) return null;	
	return _deque.remove(size()-1);
    }

    /**Removes the first element of  deque
     * Precondition: Deque is initialized
     * Postcondition: Returns the first element of deque if !isEmpty, otherwise returns null*/
    public T removeFirst() {
	if (size() == 0) return null;	
	return _deque.remove(0);
    }

    /**Removes the first occurrence of parameter o
     * Precondition: Parameter o exists in deque
     * Postcondition: Returns true if parameter o is removed from deque*/	
    public boolean remove(Object o) {
	if (size() == 0) return false;
	return _deque.remove(o);
    }

    /**Print method
     * Precondition: Deque is initialized
     * Postcondition: Returns the string version of deque*/	
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
	System.out.println("Removing last: " + table.remove());
	System.out.println("Removing first: " + table.removeFirst());
	System.out.println("Removing first: " + table.removeFirst());
	System.out.println("Removing first: " + table.removeFirst());
	System.out.println("Removing first - should produce null: " + table.removeFirst());
    }		   
}
