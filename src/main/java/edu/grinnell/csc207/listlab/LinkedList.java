package edu.grinnell.csc207.listlab;

/**
 * A linked implementation of the list ADT.
 */
public class LinkedList {

    private static class Node {

        public int value;
        public Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node first;

    public LinkedList() {
        this.first = null;
    }

    /**
     * Adds <code>value</code> to the end of the list
     *
     * @param value the value to add to the end of the list
     */
    public void add(int value) {
        if (first == null) {
            first = new Node(value, null);
        } else {
            Node cur = first;
            while (cur.next != null) {
                cur = cur.next;
            }
            Node last_node = new Node(value, null);
            cur.next = last_node;
        }
    }

    /**
     * @return the number of elements in the list
     */
    public int size() {
        Node temp = first;
        int count = 0;
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    /**
     * @param index the index of the element to retrieve
     * @return the value at the specified <code>index</code>
     */
    public int get(int index) {
        Node temp = first;
        int count = 0;
        while (temp.next != null && count != index) {
            temp = temp.next;
            count++;
        }
        return temp.value;
    }

    /**
     * Removes the value at <code>index</code> from the list
     *
     * @param index the index of the element to remove
     * @return the element at <code>index</code>
     * @throws java.lang.Exception
     */
    public int remove(int index) throws Exception {
    
        if (first == null) {
            throw new Exception();
        }
        Node temp = first;
        int count = 0;
        while (temp.next != null && count != index - 1) {
            temp = temp.next;
            count++;
        }
        int removed = temp.next.value;
        temp.next = temp.next.next;
        return removed;

    }
}
