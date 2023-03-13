package org.example;

public interface IMyList<T> {

    T addItem(T item);
    T getItem(int index);
    T removeItem();

}
