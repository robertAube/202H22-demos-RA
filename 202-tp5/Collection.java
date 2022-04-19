public interface Collection<E> extends Iterable<E> {
    // Opérations de base
    int size();
    boolean isEmpty();
    boolean contains(Object element);
    boolean equals(Object o)
    int hashCode()
    boolean add(E element);         //optional
    boolean remove(Object element); //optional
	Iterator<E> iterator();

	// Opérations de masse
	boolean containsAll(Collection<?> c);
	boolean addAll(Collection<? extends E> c); //optional
	boolean removeAll(Collection<?> c);        //optional
	boolean retainAll(Collection<?> c);        //optional
	void clear();                              //optional

	// Opérations sur les tableaux
	Object[] toArray();
	<T> T[] toArray(T[] a);
}

public interface List<E> extends Collection<E> {
    // Parcours
    E get(int index);
    E set(int index, E element);    //optional
    boolean add(E element);         //optional
    void add(int index, E element); //optional
    E remove(int index);            //optional
    boolean addAll(int index, Collection<? extends E> c); //optional

    // Recherche
    int indexOf(Object o);
    int lastIndexOf(Object o);

    // Itération
    ListIterator<E> listIterator();
    ListIterator<E> listIterator(int index);

    // Sous liste
    List<E> subList(int from, int to);
}

public interface Set<E> extends Collection<E> {
    // Opérations de base
    int size();
    boolean isEmpty();
    boolean contains(Object element);
    boolean add(E element);         //optional
    boolean remove(Object element); //optional
    Iterator<E> iterator();

    // Opérations de masse
    boolean containsAll(Collection<?> c);
    boolean addAll(Collection<? extends E> c); //optional
    boolean removeAll(Collection<?> c);        //optional
    boolean retainAll(Collection<?> c);        //optional
    void clear();                              //optional

    // Opération sur les tableaux
    Object[] toArray();
    <T> T[] toArray(T[] a);
}

public interface Map {
	Object put(Object key, Object value);
	Object get(Object key);
	Object remove(Object key);
	boolean containsKey(Object key);
	boolean containsValue(Object value);
	int size();
	boolean isEmpty();
	void putAll(Map m);
	void clear();
	public Set keySet();
	public Collection values();
	public Set entrySet();

	// Interface pour les éléments entrySet
	public interface Entry {
		Object getKey();
		Object getValue();
		Object setValue(Object value);
	}
}
