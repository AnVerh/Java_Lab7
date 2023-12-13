package Lab7;

import Lab6.Wagon;

import java.util.*;

public class WagonArrayList implements List {

    private final static int INITIAL_CAPACITY = 5;
    private Wagon[] wagons;
    private int size;

    public WagonArrayList(){
        wagons = new Wagon[INITIAL_CAPACITY];
    }
    public WagonArrayList(Wagon wagon){
        this();
        add(wagon);
    }
    public WagonArrayList(Collection<? extends Wagon> collection){
        wagons = new Wagon[collection.size()];
        addAll(collection);
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object o1 : wagons) {
            if (o.equals(o1)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(wagons, size);
    }

    @Override
    public boolean add(Object w) {
        if(w instanceof Wagon){
            resizeIfNeeded();
            wagons[size] = (Wagon)w;
            size++;
            return true;
        }
        return false;
    }
    private void resizeIfNeeded() {
        if (size == wagons.length) {
            Wagon[] newWagonArray = new Wagon[(int) (size + size / 3)];
            System.arraycopy(wagons, 0, newWagonArray, 0, size);
            wagons = newWagonArray;
        }
    }
    @Override
    public boolean remove(Object o) {
        if (contains(o)) {
            remove(indexOf(o));
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        int init_wagons_size = size;
        for (int i = 0; i < c.size(); i++) {
            resizeIfNeeded();
            if(c.toArray()[i] instanceof Wagon){
            wagons[init_wagons_size+i] = (Wagon)c.toArray()[i];
            size++;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        for (int i = 0; i < c.size(); i++) {
            resizeIfNeeded();
            if(c.toArray()[i] instanceof Wagon){
                wagons[index+i] = (Wagon)c.toArray()[i];
                size++;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        wagons = new Wagon[INITIAL_CAPACITY];
    }

    @Override
    public Object get(int index) {
        return wagons[index];
    }

    @Override
    public Object set(int index, Object element) {
        if(element instanceof Wagon){
            wagons[index] = (Wagon)element;
        }
        return null;
    }

    @Override
    public void add(int index, Object w) {
        Objects.checkIndex(index, size);
        if(w instanceof Wagon){
            resizeIfNeeded();
            wagons[index] = (Wagon)w;
            size++;
        }
    }

    @Override
    public Object remove(int index) {
        Objects.checkIndex(index, size);
        Wagon removedElement = (Wagon) wagons[index];
        System.arraycopy(wagons, index + 1, wagons, index, size - index - 1);
        size--;
        return removedElement;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(wagons[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i--) {
            if (o.equals(wagons[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
