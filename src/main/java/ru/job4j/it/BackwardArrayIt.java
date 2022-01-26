package ru.job4j.it;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BackwardArrayIt implements Iterator<Integer> {

    private final int[] date;
    private int point = 2_147_483_647;

    public BackwardArrayIt(int[] data){
        this.date = data;
    }

    @Override
    public boolean hasNext(){
        return point < date.length;
    }

    @Override
    public Integer next(){
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        return date[point--];
    }
}

