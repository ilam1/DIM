public interface Deque<T> {
    public boolean add(T e);

    public void addFirst(T e);

    public T peekFirst();

    public T peekLast();
    
    public T peek();

    public boolean contains(Object o);
    
    public T getFirst();
    
    public T getLast();

    public T remove();

    public T removeFirst();

    public T removeLast();

    public boolean remove(Object o);

    public int size();

    public String toString();
}
