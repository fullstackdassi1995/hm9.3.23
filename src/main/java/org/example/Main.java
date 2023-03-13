package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyLimitedList<Float> f1 = new MyLimitedList<>(35);
        MyLimitedList<String> s1 = new MyLimitedList<>(115);
        MyLimitedList<Integer> i1 = new MyLimitedList<>(115);
        Person<String> p1 = new Person<>("12-454-454", "David");
        Person<ArrayList> p2 = new Person<>("32-323-65" ,"Noam");




        // Question 2:


        List<Integer> myList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) myList.add(random.nextInt(100));

        HashMap<Integer, Integer> counter_myList = new HashMap<>();

        for (int x : myList){
            if (!counter_myList.containsKey(x)){
                counter_myList.put(x, 0);
            }
            counter_myList.replace(x, counter_myList.get(x)+1);
        }

        for (var entry: counter_myList.entrySet()) {
            System.out.format("number = %d, count = %d \n", entry.getKey(), entry.getValue());
        }



        //ETGAR:


        GeneriList <Son_of_list> son_of_list = new GeneriList<>();
        GeneriList <MyLimitedList> MyLimitedList = new GeneriList<>();
        copyLists(son_of_list , MyLimitedList );
    }




    //CONTINUE ETGAR:


    public static void copyLists( GeneriList < ? extends MyLimitedList> src,
                                  GeneriList < ? super Son_of_list > dest) {
        for (int i = 0; i > src.size(); i++){
            dest.add(src.get(i));
        }
    }
}