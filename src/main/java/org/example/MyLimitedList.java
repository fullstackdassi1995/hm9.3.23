package org.example;

import java.util.ArrayList;

public class MyLimitedList<T> implements IMyList{
    protected ArrayList<T> m_items;
    protected int m_max_items;

    public MyLimitedList(int m_max_items){
        this.m_max_items = m_max_items;
    }

//!
    @Override
    public T addItem(Object item) {
        if (m_items.get(m_max_items).equals(false)){
            m_items.add((T) item);
            return (T) m_items;
        }
        m_items.remove(0);
        m_items.add((T)item);
        return (T) m_items;
    }

    @Override
    public T getItem(int index) {
        m_items.get(index);
        return (T) m_items;
    }

    @Override
    public T removeItem() {
        m_items.remove(0);
        return (T) m_items;
    }


}
