package org.example;

import lombok.Getter;

import java.util.ArrayList;

public class GeneriList <T extends MyLimitedList> {
    @Getter
    ArrayList<T> list10;

}
