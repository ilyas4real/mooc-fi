/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fora
 */
public class List<Type> {

    private Type[] values;
    private int freeIndex;

    public List() {
        this.values = (Type[]) new Object[10];
    }

    public void add(Type value) {
        if (this.freeIndex == this.values.length) {
            grow();
        }

        this.values[this.freeIndex] = value;
        freeIndex++;
    }

    public void grow() {
        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }
        this.values = newValues;
    }

    public boolean contains(Type value) {
        return indexOfValue(value) >= 0;
    }

    public int indexOfValue(Type value) {
        for (int i = 0; i < this.freeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.freeIndex; i++) {
            this.values[i] = this.values[i + 1];
        }
    }

    public void remove(Type value) {
        int index = indexOfValue(value);
        if (index < 0) {
            return;
        }

        moveToTheLeft(index);
        this.freeIndex--;
    }

    public Type value(int index) {
        if (index < 0 || index >= this.freeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.freeIndex + "]");
        }

        return this.values[index];
    }

    public int size() {
        return this.freeIndex;
    }
}
