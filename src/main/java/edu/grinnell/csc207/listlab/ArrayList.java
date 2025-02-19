package edu.grinnell.csc207.listlab;

import java.util.Arrays;

/**
 * An array-based implementation of the list ADT.
 */
public class ArrayList {
    
    private int[] array;
    private int size; // the number of elements 
    private static final int INITIAL_SIZE = 50;
    
    // the length of the backing array: capacity
    
    public ArrayList() {
        this.array = new int[INITIAL_SIZE];
        this.size = 0;
    }
    
    private void ensureCapacity() {
        if(size == array.length){
            // allocate a new, bigger array
            array = Arrays.copyOf(array, array.length * 2);
        }
    }
    /**
     * Adds <code>value</code> to the end of the list
     * 
     * @param value the value to add to the end of the list
     */
    public void add(int value) {
        ensureCapacity();
        array[size] = value;
        size++;
    }

    /**
     * @return the number of elements in the list
     */
    public int size() {
        return size;
    }

    /**
     * @param index the index of the element to retrieve
     * @return the value at the specified <code>index</code>
     */
    public int get(int index) {
        return array[index];
    }

    /**
     * Removes the value at <code>index</code> from the list
     * 
     * @param index the index of the element to remove
     * @return the element at <code>index</code>
     */
    public int remove(int index) {
        int removed = array[index];
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        return removed;
    }
}
