import java.util.Iterator;

public class CustomLinkedList implements Iterable<Integer>{
    int size;
    Node first;
    Node last;

    public CustomLinkedList() {
    }
    //Adds a new node with the given value at the end of the list.
    public void add(int value) {
        Node newNode = new Node(value, null);
        if (size ==0 ){
            first = newNode;
            last = newNode;
            size++;
        }
        else {
            while (last != null){
                last.next = newNode;
                last = newNode;
                size++;
                break;
            }
        }

    }
    //Adds a new node with the given value at the beginning of the list.
    public void addFirst(int value){
        Node newNode = new Node(value, null);
        if (first == null){
            first = newNode;
        }
        else {
            newNode.next = first;
            first = newNode;
            size++;
        }
    }
    //Removes the first occurrence of the specified value from the list.
    public void remove (int value){
        Node current;
        if (first.data == value){
            current = first.next;
            first = current;
            size--;
        }
       else if (last.data == value){
           for (Node x = first; x != null; x = x.next){
               if (x.next == last){
                   x.next = null;
                   last = x;
                   size--;
                   break;
               }
           }
       }
       else {
           Node xPrev = first;
           for (Node x = first; x != null; x = x.next){
               if (x.data == value){
                   for (xPrev = first; x != null; xPrev = xPrev.next){
                       if (xPrev.next == x){
                           xPrev.next = x.next;
                           x.next = null;
                           size--;
                           break;
                       }
                   }
               }
           }
        }
    }
    // Returns the value at the specified index. If the index is out of bounds, throw an IndexOutOfBoundsException.
    public int get(int index){
        int data = Integer.MIN_VALUE;
        if (index >= size){
            throw new IndexOutOfBoundsException();
        }
        int i = 0;
        for (Node x = first; x != null; x = x.next){
            if (i == index){
                data = x.data;
                break;
            }
            i++;
        }
        return data;
    }

    //Returns the number of elements in the list.
    public int size(){
        return size;
    }
    //Returns true if the list contains the specified value,
    public boolean contains(int value){
        for (Node x = first; x != null; x = x.next){
            if (value == x.data){
                return true;
            }
        }
        return false;
    }
    //Removes all elements from the list, resetting it to an empty list.
    public void clear(){
        first = null;
        last = null;
        size = 0;
    }

    public Iterator <Integer> iterator(){
        return new CustomIterator();
    }


    public class CustomIterator implements Iterator<Integer>{
        int cursor = 0;
        int lastRetValue = -1;

        //Returns true if there are more elements to iterate over, false otherwise.
        public boolean hasNext(){
            return cursor != size;
        }
        //Returns the next element in the list and moves the cursor forward.
        public Integer next(){
            int next = get(cursor);
            lastRetValue = cursor;
            cursor++;
            return next;
        }
        // Removes the last element returned by this iterator. This method should be optional and handle cases
        // where remove() is called without a preceding next() call.
        public void remove(){
            if (lastRetValue < 0) {
                throw new IllegalStateException();
            }
            CustomLinkedList.this.remove(lastRetValue);
            if (lastRetValue < cursor) {
                cursor--;
            }
            lastRetValue = -1;
        }
    }
    private static class Node {
        int data;
        Node next;


        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

}
