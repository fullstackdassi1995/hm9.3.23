package org.example;

import lombok.Getter;

public class Son_of_list extends MyLimitedList {
    @Getter
   protected String name;
    public Son_of_list(int m_max_items , String name) {
        super(m_max_items);
        this.name = name;
    }

}
