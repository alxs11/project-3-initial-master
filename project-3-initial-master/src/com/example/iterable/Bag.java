package com.example.iterable;

import java.util.Iterator;
import java.util.ArrayList;

public class Bag<T> implements Container<T> {

    //generic list for Bag class
    private ArrayList<T> list;

    //constructor to initialize list
    public Bag() {
        list = new ArrayList<>();
    }

    //allows iterator to perform forEach loop in BagManager
    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    //override isEmpty() for list
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    //override size() to return size of list
    @Override
    public int size() {
        return list.size();
    }

    //override add() to add items to list
    @Override
    public void add(T item) {
        list.add(item);
    }
}
