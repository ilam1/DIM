public interface Deque<T> {

    /**Inserts parameter e of type T to the end of the deque
     * Precondition: Parameter e is added
     * Postcondition: e is added to the end of deque */
    public void addLast(T e);

    /**Inserts parameter e of type T to the beginning of the deque
     * Precondition: Parameter e is added
     * Postcondition: e is added to the beginning of deque */
    public void addFirst(T e);

    /**Retrieves the first element of deque
     * Precondition: Deque is initialized
     * Postcondition: Returns the first element of deque if !isEmpty, otherwise returns null */
    public T peekFirst();

    /**Retrieves the last element of deque
     * Precondition: Deque is initialized
     * Postcondition: Returns the last element of deque if !isEmpty, otherwise returns null */
    public T peekLast();

    /**Determines whether parameter e is contained in deque
     * Precondition: Deque is initialized
     * Postcondition: Returns true if parameter e is in deque, false otherwise*/
    public boolean contains(Object o);

    public T remove();

    public T removeFirst();

    public T removeLast();

    public boolean remove(Object o);

    public int size();

    public String toString();
}
