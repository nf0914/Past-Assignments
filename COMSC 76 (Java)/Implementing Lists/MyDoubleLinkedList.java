/**
 * Niklas Feil-Ho
 */

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * Assignment for the Implementing Lists module.
 * You need to implement all the TODOs.
 * To see what each method needs to do check out: 
 * https://docs.oracle.com/javase/8/docs/api/java/util/List.html
 * @author Balaji.Srinivasan@evc.edu
 * 
 *  @param <T> the type of elements in this list
 */
public class MyDoubleLinkedList<T> implements List<T> {
    /**
     * Each node in the linked list is represented by this class. It contains a forward and backward pointer
     * to allow traversal in both directions
     * 
     * 
     */
    static class Node<T> {
        T data;
        Node<T> prev, next;

        /**
         * Creates a new node and set its prev/next pointers. 
         * NOTE: This does NOT adjust the pointers of the prev and next nodes by design.
         */
        public Node(T t, Node<T> prev, Node<T> next) {
        	this.data = t;
        	this.prev = prev;
            this.next = next;
        }
    };

    /**
     * The head of the list.
     */ 
    Node<T> head;
    /**
     * The tail of the list.
     */
    Node<T> tail;

    /**
     * The number of elements in the list.
     */
     int numElements;

    /**
     * The list iterator implementation for the double linked list.
     * NOTE: You need to implement all the TODOs below.
     * To understand what each method has to do check out:
     * https://docs.oracle.com/javase/8/docs/api/java/util/ListIterator.html
     * 
     * @param <T> the type of elements returned by the iterator
     */
    public static class DoubleLinkedListIterator<T> implements ListIterator<T> {
        Node<T> current;
        
        /**
         * Constructs a list iterator starting from the given node.
         *
         * @param head the first node of the list
         */
        
        public DoubleLinkedListIterator(Node<T> head) {
        	this.current = new Node<>(null, null, head);
        }

        @Override
        /**
         * Returns {@code true} if there are more elements when traversing forward.
         *
         * @return {@code true} if there is a next element
         */
        public boolean hasNext() {
           return current.next != null;
            //throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
        }

        @Override
        /**
         * Returns the next element in the list.
         *
         * @return the next element
         * @throws NoSuchElementException if the iteration has no next element
         */
        public T next() {
            // TODO: Implement this method.
        	if (!hasNext()) {
        		throw new NoSuchElementException();
        	}
        	current = current.next;
        	
        	return current.data;
            //throw new UnsupportedOperationException("Unimplemented method 'next'");
        }

        @Override
        /**
         * Returns {@code true} if there are more elements when traversing backward.
         *
         * @return {@code true} if there is a previous element
         */
        public boolean hasPrevious() {
            // TODO: Implement this method.
        	return current.prev != null;
          //throw new UnsupportedOperationException("Unimplemented method 'hasPrevious'");
        }

        @Override
        /**
         * Returns the previous element in the list.
         *
         * @return the previous element
         * @throws NoSuchElementException if the iteration has no previous element
         */
        public T previous() {
            // TODO: Implement this method.
        	if (!hasPrevious()) {
        		throw new NoSuchElementException();
        	}
        	current = current.prev;
        	
        	return current.data;
           // throw new UnsupportedOperationException("Unimplemented method 'previous'");
        }

        @Override
        public int nextIndex() {
            // No need to implement this method.
            throw new UnsupportedOperationException("Unimplemented method 'nextIndex'");
        }

        @Override
        public int previousIndex() {
            // No need to implement this method.
            throw new UnsupportedOperationException("Unimplemented method 'previousIndex'");
        }

        @Override
        public void remove() {
            // No need to implement this method.
            throw new UnsupportedOperationException("Unimplemented method 'remove'");
        }

        @Override
        public void set(T e) {
            // No need to implement this method.
            throw new UnsupportedOperationException("Unimplemented method 'set'");
        }

        @Override
        public void add(T e) {
            // No need to implement this method.
            throw new UnsupportedOperationException("Unimplemented method 'add'");
        }
    }

    @Override
    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    public int size() {
        // TODO: Implement this method.
    	return numElements;
        //throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    /**
     * Returns {@code true} if this list contains no elements.
     *
     * @return {@code true} if this list is empty
     */
    public boolean isEmpty() {
        // TODO: Implement this method.
    	return numElements == 0;
        //throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    /**
     * Returns {@code true} if this list contains the specified element.
     *
     * @param o element whose presence in this list is to be tested
     * @return {@code true} if this list contains the specified element
     */
    public boolean contains(Object o) {
        // TODO: Implement this method.
    	Node<T> current = head;
    	
    	while (current != null) {
    		if (current.data.equals(o)) {
    			return true;
    		}
    		current = current.next;
    	}
    	return false;
        //throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    /**
     * Returns an iterator over the elements in this list in proper sequence.
     *
     * @return an iterator over the elements in this list in proper sequence
     */
    public Iterator<T> iterator() {
        // TODO: Implement this method.
    	return new DoubleLinkedListIterator<T>(head);
        //throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
 

    @Override
    /**
     * Returns an array containing all of the elements in this list in proper sequence.
     *
     * @return an array containing all of the elements in this list
     */
    public Object[] toArray() {
        // TODO: Implement this method.
    	Object[] array = new Object[numElements];
    	
    	Node<T> current = head;
    	int i = 0;
    	while (current != null) {
    		array[i] = current.data;
    		current = current.next;
    		i++;
    	}
    	return array;
    	
        //throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public <E> E[] toArray(E[] a) {
        // No need to implement this method.
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    /**
     * Appends the specified element to the end of this list.
     *
     * @param t element to be appended to this list
     * @return {@code true} (as specified by {@link Collection#add})
     */
    public boolean add(T t) {
        // TODO: Implement this method.
    	Node<T> newNode = new Node<>(t, tail, null);
    	
    	if (head == null) {
    		head = newNode;
    		tail = newNode;
    	} else {
    		tail.next = newNode;
    		newNode.prev = tail;
    		tail = newNode;
    	}
    	
    	numElements++;
    	
    	return true;
        //throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    /**
     * Removes the first occurrence of the specified element from this list, if it is present.
     *
     * @param o element to be removed from this list, if present
     * @return {@code true} if this list contained the specified element
     */
    public boolean remove(Object o) {
        // TODO: Implement this method.
    	Node<T> current = head;

        while (current != null) {
            if (current.data.equals(o)) {
                // If the node is the head
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null;  // If the list becomes empty
                    }
                }
                // If the node is the tail
                else if (current == tail) {
                    tail = current.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                }
                // If the node is in the middle
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

                numElements--;
                return true;  // Element found and removed
            }

            current = current.next;
        }

        return false;  // Element not found
		}
	        //throw new UnsupportedOperationException("Unimplemented method 'remove'");

    @Override
    /**
     * Returns {@code true} if this list contains all of the elements in the specified collection.
     *
     * @param c collection to be checked for containment in this list
     * @return {@code true} if this list contains all of the elements in the specified collection
     */
    public boolean containsAll(Collection<?> c) {
        // TODO: Implement this method.
    	for (Object element : c) {
    		if (!this.contains(element)) {
    			return false;
    		}
    	}
    	return true;
        //	throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }

    @Override
    /**
     * Appends all of the elements in the specified collection to the end of this list, 
     * in the order that they are returned by the specified collection's iterator.
     *
     * @param c collection containing elements to be added to this list
     * @return {@code true} if this list changed as a result of the call
     */
    public boolean addAll(Collection<? extends T> c) {
        // TODO: Implement this method.
    	if (c.isEmpty()) {
    	       return false;  // Nothing to add
    	   }
    	   for (T element : c) {
    	       this.add(element);  // Use the `add(T element)` method
    	   }
    	   return true;  // Elements added successfully
        //throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    /**
     * Inserts all of the elements in the specified collection into this list at the specified position.
     *
     * @param index index at which to insert the first element from the specified collection
     * @param c collection containing elements to be added to this list
     * @return {@code true} if this list changed as a result of the call
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public boolean addAll(int index, Collection<? extends T> c) {
        // TODO: Implement this method for extra credit.
    	if (index < 0 || index > numElements) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numElements);
        }
        if (c.isEmpty()) {
            return false;
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        // Insert elements from the collection in the correct order
        Node<T> prev = (current != null) ? current.prev : tail;
        for (T element : c) {
            Node<T> newNode = new Node<>(element, prev, current);
            if (prev != null) {
                prev.next = newNode;
            } else {
                head = newNode; // We're at the head
            }
            if (current != null) {
                current.prev = newNode;
            } else {
                tail = newNode; // We're at the tail
            }
            prev = newNode;
            numElements++;
        }

        return true;
    	//throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    /**
     * Removes from this list all of its elements that are contained in the specified collection.
     *
     * @param c collection containing elements to be removed from this list
     * @return {@code true} if this list changed as a result of the call
     */
    public boolean removeAll(Collection<?> c) {
        // TODO: Implement this method for extra credit.
    	boolean modified = false;
        for (Object element : c) {
            while (this.contains(element)) {
                this.remove(element);
                modified = true;
            }
        }
        return modified;
        //throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    /**
     * Retains only the elements in this list that are contained in the specified collection.
     *
     * @param c collection containing elements to be retained in this list
     * @return {@code true} if this list changed as a result of the call
     */
    public boolean retainAll(Collection<?> c) {
        // TODO: Implement this method for extra credit.
    	boolean modified = false;
        Node<T> current = head;
        while (current != null) {
            if (!c.contains(current.data)) {
                Node<T> next = current.next; // Keep a reference to the next node
                this.remove(current.data);
                current = next; // Move to the next node
                modified = true;
            } else {
                current = current.next;
            }
        }
        return modified;
        //throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }

    @Override
    /**
     * Removes all of the elements from this list.
     */
    public void clear() {
        // TODO: Implement this method.
    	head = null;
    	tail = null;
    	
    	numElements = 0;
        //throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public T get(int index) {
        // TODO: Implement this method.
    	if (index < 0 || index >= numElements) {
    		throw new IndexOutOfBoundsException("Index " + index + ", Size: " + numElements);
    	}
    	
    	Node<T> current;
    	
    	if(index < numElements / 2) {
    		current = head;
    		for (int i = 0; i < index; i++) {
    			current = current.next;
    		}
    	} else {
    		current = tail;	
    		for (int i = numElements - 1; i > index; i--) {
    			current = current.prev;
    		}
    	}
    	return current.data;
        //throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    /**
     * Replaces the element at the specified position in this list with the specified element.
     *
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public T set(int index, T element) {
        // TODO: Implement this method.
    	if (index < 0 || index >= numElements) {
            throw new IndexOutOfBoundsException("Index " + index + ", Size: " + numElements);
        }

        Node<T> current;

        if (index < numElements / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = numElements - 1; i > index; i--) {
                current = current.prev;
            }
        }

        T oldData = current.data;
        current.data = element;
        return oldData;  // Return the old element
        //throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    /**
     * Inserts the specified element at the specified position in this list.
     *
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public void add(int index, T element) {
        // TODO: Implement this method.
    	 if (index < 0 || index > numElements) {
    	        throw new IndexOutOfBoundsException("Index " + index + ", Size: " + numElements);
    	    }

    	    if (index == 0) {
    	        // Adding at the head
    	        Node<T> newNode = new Node<>(element, null, head);
    	        if (head != null) {
    	            head.prev = newNode;
    	        }
    	        head = newNode;
    	        if (tail == null) {
    	            tail = newNode;  // If the list was empty, update the tail
    	        }
    	        numElements++;
    	        return;
    	    }

    	    if (index == numElements) {
    	        // Adding at the tail
    	        add(element);  // Reuse the add(T t) method
    	        return;
    	    }

    	    // Adding in the middle
    	    Node<T> current;
    	    if (index < numElements / 2) {
    	        current = head;
    	        for (int i = 0; i < index; i++) {
    	            current = current.next;
    	        }
    	    } else {
    	        current = tail;
    	        for (int i = numElements - 1; i > index; i--) {
    	            current = current.prev;
    	        }
    	    }

    	    Node<T> newNode = new Node<>(element, current.prev, current);
    	    current.prev.next = newNode;
    	    current.prev = newNode;

    	    numElements++; 
        //throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    /**
     * Removes the element at the specified position in this list.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public T remove(int index) {
        // TODO: Implement this method.
    	if (index < 0 || index >= numElements) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numElements);
        }

        Node<T> current;

        // Special case for removing the head
        if (index == 0) {
            current = head;
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;  // List is now empty
            }
            numElements--;
            return current.data;
        }

        // Special case for removing the tail
        if (index == numElements - 1) {
            current = tail;
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;  // List is now empty
            }
            numElements--;
            return current.data;
        }

        // General case for removing from the middle
        if (index < numElements / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = numElements - 1; i > index; i--) {
                current = current.prev;
            }
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;

        numElements--;

        return current.data;
        //throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    /**
     * Returns the index of the first occurrence of the specified element in this list, 
     * or -1 if this list does not contain the element.
     *
     * @param o element to search for
     * @return the index of the first occurrence of the specified element, or -1 if not found
     */
    public int indexOf(Object o) {
        // TODO: Implement this method.
    	Node<T> current = head;
    	int index = 0;
    	
    	while (current != null) {
    		if (current.data.equals(o)) {
    			return index;
    		}
    		
    		current = current.next;
    		index++;
    	}
    	
    	return -1;
        //throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

    @Override
    /**
     * Returns the index of the last occurrence of the specified element in this list, 
     * or -1 if this list does not contain the element.
     *
     * @param o element to search for
     * @return the index of the last occurrence of the specified element, or -1 if not found
     */
    public int lastIndexOf(Object o) {
        // TODO: Implement this method for extra credit.
    	Node<T> current = tail;
        int index = numElements - 1;

        while (current != null) {
            if (current.data.equals(o)) {
                return index;
            }
            current = current.prev;
            index--;
        }

        return -1; // Element not found
        //throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }

    @Override
    /**
     * Returns a list iterator over the elements in this list (in proper sequence).
     *
     * @return a list iterator over the elements in this list
     */
    public ListIterator<T> listIterator() {
        // TODO: Implement this method.
    	return new DoubleLinkedListIterator<>(head);
        //throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    /**
     * Returns a list iterator over the elements in this list (in proper sequence), 
     * starting at the specified position in the list.
     *
     * @param index index of the first element to be returned from the list iterator
     * @return a list iterator over the elements in this list, starting at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public ListIterator<T> listIterator(int index) {
        // TODO: You can implement this method for extra credit.
    	if (index < 0 || index > numElements) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numElements);
        }

        DoubleLinkedListIterator<T> iterator = new DoubleLinkedListIterator<>(head);
        for (int i = 0; i < index; i++) {
            iterator.next();
        }
        return iterator;
       //throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        // No need to implement this method.
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }
}
