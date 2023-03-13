package org.example;

import lombok.Getter;

import java.util.ArrayList;

public class GeneriList <T extends MyLimitedList> {
    @Getter
    protected ArrayList<T> list10;

    public GeneriList(){
        this.list10 = new ArrayList<>();
    }

    public int size(){
         return this.list10.size();
    }

    public void add(T item){
        this.list10.add(item);
    }

    public T get(int index){
        return  this.list10.get(index);
    }

}
