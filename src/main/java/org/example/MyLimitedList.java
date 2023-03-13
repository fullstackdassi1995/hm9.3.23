package org.example;

import java.util.ArrayList;

public class MyLimitedList<T> implements IMyList<T>{
    protected ArrayList<T> m_items;
    protected int m_max_items;

    public MyLimitedList(int m_max_items){
        this.m_max_items = m_max_items;
        this.m_items = new ArrayList<>(m_max_items);
    }

//!
    @Override
    public void addItem(T item) {
        if (m_items.size() <= m_max_items){
            m_items.add(item);
        }
        m_items.remove(0);
        m_items.add(item);
    }

    @Override
    public T getItem(int index) {
        return m_items.get(index);
    }

    @Override
    public void removeItem() {
        m_items.remove(0);

    }


}
