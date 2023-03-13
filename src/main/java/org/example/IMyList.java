package org.example;

public interface IMyList<T> {

    void addItem(T item);
    T getItem(int index);
    void removeItem();

}
